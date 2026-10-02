package Task13.Bank;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final int ACCOUNTS = 10;
    private static final int TRANSFERS = 1000;
    private static final int POOL_SIZE = 8;
    private static final long INITIAL_PLN = 1000;
    private static final long EXPECTED_TOTAL_GR = ACCOUNTS * INITIAL_PLN * 100L;

    public static void main(String[] args) {
        Bank bank = new Bank();
        for (long i = 1; i <= ACCOUNTS; i++) {
            bank.openAccount(i, INITIAL_PLN);
        }

        Random rnd = new Random(10);
        ExecutorService pool = Executors.newFixedThreadPool(POOL_SIZE);
        AtomicInteger failed = new AtomicInteger();
        CompletableFuture<?>[] all = new CompletableFuture[TRANSFERS];

        for (int i = 0; i < TRANSFERS; i++) {
            final long from = 1 + rnd.nextInt(ACCOUNTS);
            long to = 1 + rnd.nextInt(ACCOUNTS);
            while (to == from) to = 1 + rnd.nextInt(ACCOUNTS);
            final long toF = to;
            final long amount = (100 + rnd.nextInt(401)) * 100L;

            all[i] = CompletableFuture.runAsync(() -> {
                try {
                    bank.transfer(from, toF, amount);
                } catch (InsufficientFundsException e) {
                    failed.incrementAndGet();
                }
            }, pool);
        }

        CompletableFuture.allOf(all).join();
        pool.shutdown();

        for (long id = 1; id <= ACCOUNTS; id++) {
            System.out.println("Konto " + id + ": " + bank.getBalance(id) / 100 + " PLN");
        }
        long total = bank.totalBalanceGr();
        System.out.println("Total: " + total + " gr");
        System.out.println("Failed transfers: " + failed.get());

        if (total != EXPECTED_TOTAL_GR) {
            throw new AssertionError("Assertion Error! Race condition occurs somewhere!");
        }
        System.out.println("OK");
    }
}