package ThreadPool;

import java.util.concurrent.CompletableFuture;

public class StockPriceDataFetch {
    CompletableFuture<Object> future = new CompletableFuture<>();


    private int getAPIResponse(int millis) {// API calling
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return millis;
    }

    public CompletableFuture<Object> fetchStockPriceFromApi1(String symbol) {
        return CompletableFuture.supplyAsync(() -> {
            // Simulate a network delay
            var val = getAPIResponse(2000); // Simulate a delay of 2 seconds
            return val; // Simulated stock price from API 1
        });
    }
}
