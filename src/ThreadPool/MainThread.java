package ThreadPool;

import java.util.concurrent.CompletableFuture;

public class MainThread implements CallBack{
    public void main(String[] args) {
//        callALL();
        future();
    }

    @Override
    public void getResult(String Result) {
        System.out.println(" The result is "+Result);
    }

    public void callALL(){
        APIService apiService = new APIService(this);
        Thread thread = new Thread(apiService);
        System.out.println(apiService.getResult());
        thread.start();
        System.out.println("collections.Main thread starts");

    }

    public void future(){
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            sleep(1000);
            return "Hello";
        });

        future.thenApply(result -> result + ", World!")
                .thenAccept(System.out::println);

        // Prevent main thread from exiting early
        sleep(2000);
    }
    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
