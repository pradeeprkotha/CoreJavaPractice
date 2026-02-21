package threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleteClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        compete(1);
        compete(2);
        compete(3);
        System.out.println("Just print");
    }

    public static void compete(int k) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            return 42;  // Computed result
        });

        System.out.println("Waiting for result..."+k);
        Integer result = future.get();  // Blocks until result is available
        System.out.println("Result: " + result);
    }
}
