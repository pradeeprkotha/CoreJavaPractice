package threads;

public class MultiThreadMain {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Tset");
        for(int i=0; i<500;i++){
            MyThreadThing thing = new MyThreadThing(i);
            Thread.startVirtualThread(thing);
            Thread.sleep(500);
        }


    }
}
