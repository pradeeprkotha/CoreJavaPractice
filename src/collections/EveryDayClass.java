package collections;

public class EveryDayClass {
    public static void main(String[] args) {
        SingleClass instance = SingleClass.getObject();
        System.out.println(instance.getNumber());

       SingleClass s1 = SingleClass.getObject();

       if(s1 == instance) {
           System.out.println("Both are same");
       }


       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("I am running");
           }
       };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("I am running 2000");
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
        Thread t2 = new Thread(runnable2);
        t2.start();
        Thread t3 = new Thread(runnable);
        t3.start();


    }
}
