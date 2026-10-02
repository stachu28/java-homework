package Task13;

import java.util.Random;

public class ParallelSum {

    private static final int SIZE = 1_000_000;
    private static final int PARTS = 4;

    static class PartialSumTask implements Runnable {
        private final int[] data;
        private final int from;
        private final int to;
        private final long[] results;
        private final int index;

        public PartialSumTask(int[] data, int from, int to, long[] results, int index) {
            this.data = data;
            this.from = from;
            this.to = to;
            this.results = results;
            this.index = index;
        }

        @Override
        public void run() {
            long sum = 0;
            for (int i = from; i < to; i++) {
                sum += data[i];
            }
            results[index] = sum;
        }
    }

    static long sequentialSum(int[] data) {
        long sum = 0;
        for (int x : data) sum += x;
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[SIZE];
        Random random = new Random(10);
        for (int i = 0; i < SIZE; i++) {
            data[i] = random.nextInt(1000);
        }

        long[] results = new long[PARTS];
        Thread[] threads = new Thread[PARTS];

        int base = SIZE / PARTS;
        int from = 0;

        for (int k = 0; k < PARTS; k++) {
            int to = from + base;
            threads[k] = new Thread(new PartialSumTask(data, from, to, results, k));
            System.out.println("Part " + (k + 1) + ": (" + from + ", " + to + ")");
            from = to;
        }

        for (Thread t : threads) t.start();
        for (Thread t : threads) t.join();

        long parallel = 0;
        for (long r : results) parallel += r;

        long sequential = sequentialSum(data);
        System.out.println("Parallel:   " + parallel);
        System.out.println("Sequential: " + sequential);
        System.out.println(parallel == sequential ? "OK" : "ERROR");
    }
}