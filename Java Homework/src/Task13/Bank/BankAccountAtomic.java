package Task13.Bank;

import java.util.concurrent.atomic.AtomicReference;

public class BankAccountAtomic {

    private record Snapshot(long balanceGr, long version) {
    }

    private final AtomicReference<Snapshot> state;

    public BankAccountAtomic(long initialPln) {
        this.state = new AtomicReference<>(new Snapshot(initialPln * 100, 0));
    }

    public void deposit(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("The amount must be greater than 0!");
        state.updateAndGet(snapshot -> new Snapshot(snapshot.balanceGr + amountGr, snapshot.version + 1));
    }

    public boolean tryWithdraw(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("The amount must be greater than 0!");
        while (true) {
            Snapshot current = state.get();
            if (current.balanceGr() < amountGr) {
                return false;
            }
            Snapshot next = new Snapshot(current.balanceGr() - amountGr, current.version() + 1);
            if (state.compareAndSet(current, next)) {
                return true;
            }
        }
    }

    public long balanceGr() {
        return state.get().balanceGr();
    }
}