package ThreadPool;

public class APIService implements Runnable{

    private int result = 0;
    @Override
    public void run() {
        try {
            Thread.sleep(900*2);
            result = 26;
            Thread.sleep(900*2);
            result = 36;
            System.out.println("I am running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getResult() {
        return result;
    }
}
