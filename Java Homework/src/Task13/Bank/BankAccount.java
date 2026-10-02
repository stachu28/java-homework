package Task13.Bank;

public class BankAccount {

    private final Long id;
    private long balanceGr;

    public BankAccount(Long id, long initialPln) {
        this.id = id;
        this.balanceGr = initialPln * 100;
    }

    public synchronized void deposit(long amountGr) {
        if (amountGr <= 0) {
            throw new IllegalArgumentException("The amount must be greater than 0");
        }
        balanceGr += amountGr;
    }

    public synchronized void withdraw(long amountGr) {
        if (amountGr <= 0) {
            throw new IllegalArgumentException("The amount must be greater than 0");
        }
        if (amountGr > balanceGr) {
            throw new InsufficientFundsException(id, balanceGr, amountGr);
        }
        balanceGr -= amountGr;
    }

    public synchronized long getBalanceGr() {
        return balanceGr;
    }

    public Long getId() {
        return id;
    }
}