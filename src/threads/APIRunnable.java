package threads;

public class APIRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Its from APIRunnable");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
