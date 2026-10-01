package Task13.Bank;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Long accountId, long balanceGr, long requestedGr) {
        super("Account: " + accountId + " exceeded its balance\n" +
                "Balance: " + balanceGr + ", requested: " + requestedGr);
    }
}