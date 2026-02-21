package ThreadPool;

public class APIService implements Runnable{

    private MainThread mt;

    public APIService(MainThread mt){
        this.mt = mt;
    }
    private int result = 0;
    private String result1;
    @Override
    public void run() {
        try {
            Thread.sleep(900*2);
            result1 = "26";
            Thread.sleep(900*2);
            result1 = "36";
            System.out.println("I am running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mt.getResult(result1);
    }

    public int getResult() {
        return result;
    }
}
