package threads;

public class APICallLogin extends Thread{
    @Override
    public void run() {
        System.out.println("Its a print from APICallLogin");
        super.run();
    }
}
