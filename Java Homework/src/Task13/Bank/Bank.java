package Task13.Bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<Long, BankAccount> accounts = new HashMap<>();
    // HashMap, bo konta tworzone są tylko raz, przed startem symulacji,
    // a potem są jedynie odczytywane — nie zachodzi potrzeba synchronizacji.

    public void openAccount(long id, long initialPln) {
        accounts.put(id, new BankAccount(id, initialPln));
    }

    public void transfer(long fromId, long toId, long amountGr) {
        if (fromId == toId) return;
        if (amountGr <= 0) {
            throw new IllegalArgumentException("Transfer amount cannot equal 0 or be negative");
        }

        BankAccount from = accounts.get(fromId);
        BankAccount to = accounts.get(toId);

        BankAccount first = fromId < toId ? from : to;
        BankAccount second = fromId < toId ? to : from;

        synchronized (first) {
            synchronized (second) {
                from.withdraw(amountGr);
                to.deposit(amountGr);
            }
        }
    }

    public long totalBalanceGr() {
        long sum = 0;
        for (BankAccount a : accounts.values()) {
            sum += a.getBalanceGr();
        }
        return sum;
    }

    public long getBalance(long id) {
        return accounts.get(id).getBalanceGr();
    }
}