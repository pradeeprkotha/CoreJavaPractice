package threads;

public class MyThreadThing implements Runnable{

    private int threadNumber;
    public MyThreadThing(int n){
        this.threadNumber= n;
    }

    @Override
    public void run() {
        for (int i=0; i<=5; i++){



            System.out.println(threadNumber+"Its from thread = "+i);

            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
