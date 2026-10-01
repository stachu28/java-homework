package Task13;

public class CounterTask implements Runnable {

    private final int number;

    public CounterTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread " + number + " start");
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + number + ": " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Thread " + number + " end");
    }

    public static void main(String[] args) throws InterruptedException {
        final int N = 5;
        Thread[] threads = new Thread[N];
        for (int i = 0; i < N; i++) {
            threads[i] = new Thread(new CounterTask(i + 1), "thread-" + (i + 1));
        }
        for (Thread t : threads) t.start();
        for (Thread t : threads) t.join();
        System.out.println("Wszystkie wątki zakończyły działanie.");
    }
}