package threads;

public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Its demo");

        Runnable task = () -> {
            System.out.println("Running in: ");
            try {
                Thread.sleep(1000); // Simulates blocking I/O
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        for (int i = 0; i < 100; i++) {
            Thread.startVirtualThread(task);
            Thread.sleep(1000);
        }


    }
}
