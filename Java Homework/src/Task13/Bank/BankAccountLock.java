package Task13.Bank;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLock {

    private final Long id;
    private final ReentrantLock lock = new ReentrantLock();
    private long balanceGr;

    public BankAccountLock(Long id, long initialPln) {
        this.id = id;
        this.balanceGr = initialPln * 100;
    }

    void depositUnlocked(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("The amount must be greater than 0!");
        balanceGr += amountGr;
    }

    void withdrawUnlocked(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("The amount must be greater than 0!");
        if (amountGr > balanceGr) {
            throw new InsufficientFundsException(id, balanceGr, amountGr);
        }
        balanceGr -= amountGr;
    }

    ReentrantLock lock() {
        return lock;
    }

    long balanceGr() {
        return balanceGr;
    }
}