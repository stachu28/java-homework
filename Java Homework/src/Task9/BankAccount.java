package Task9;

final class BankAccount {
    private int balance;

    public BankAccount(int initial) {
        this.balance = initial;
    }

    void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough funds! Balance: " + balance);
        }
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}