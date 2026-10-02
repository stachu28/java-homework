package Task13;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class FactorialPool {

    private static final int POOL_SIZE = 4;
    private static final int MAX_N = 20;

    static BigInteger factorial(int n) {
        int delay = ThreadLocalRandom.current().nextInt(100, 501);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(POOL_SIZE);
        List<Future<BigInteger>> futures = new ArrayList<>();

        long start = System.nanoTime();

        for (int n = 1; n <= MAX_N; n++) {
            final int nn = n;
            futures.add(pool.submit(() -> factorial(nn)));
        }

        for (int i = 0; i < futures.size(); i++) {
            BigInteger result = futures.get(i).get();
            System.out.println((i + 1) + ": " + result);
        }
        long elapsedMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Time: " + (elapsedMs / 1000.0) + " s");

        pool.shutdown();
    }
}