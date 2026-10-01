package Task13.Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BankLocked {

    private final Map<Long, BankAccountLock> accounts = new HashMap<>();

    public void openAccount(long id, long initialPln) {
        accounts.put(id, new BankAccountLock(id, initialPln));
    }

    public boolean transfer(long fromId, long toId, long amountGr) {
        if (fromId == toId) return true;
        if (amountGr <= 0) throw new IllegalArgumentException();

        BankAccountLock from = accounts.get(fromId);
        BankAccountLock to = accounts.get(toId);

        long deadline = System.currentTimeMillis() + 1000;

        while (System.currentTimeMillis() < deadline) {
            boolean gotFirst = false, gotSecond = false;
            try {
                gotFirst = from.lock().tryLock(50, TimeUnit.MILLISECONDS);
                if (!gotFirst) continue;

                gotSecond = to.lock().tryLock(50, TimeUnit.MILLISECONDS);
                if (!gotSecond) continue;

                from.withdrawUnlocked(amountGr);
                to.depositUnlocked(amountGr);
                return true;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            } finally {
                if (gotSecond) to.lock().unlock();
                if (gotFirst) from.lock().unlock();
            }
        }
        return false;
    }

    public long totalBalanceGr() {
        long sum = 0;
        for (BankAccountLock a : accounts.values()) {
            sum += a.balanceGr();
        }
        return sum;
    }

    public long getBalance(long id) {
        return accounts.get(id).balanceGr();
    }
}