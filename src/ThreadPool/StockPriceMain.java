package ThreadPool;

import java.util.concurrent.CompletableFuture;

// Main class Implementation of API calling
public class StockPriceMain {
    public static void main(String[] args) {
        String API = "https://api.coindesk.com/v1/bpi/currentprice.json";

        StockPriceDataFetch fetcher = new StockPriceDataFetch();

        CompletableFuture<Object> api1Results = fetcher.fetchStockPriceFromApi1(API);
        CompletableFuture<Object> api1Results2 = fetcher.fetchStockPriceFromApi1(API);
        CompletableFuture<Object> api1Results3 = fetcher.fetchStockPriceFromApi1(API);

        api1Results.thenAccept(price -> {
            System.out.println("Received stock price : $" + price);
        }).join();
        api1Results2.thenAccept(price -> {
            System.out.println("Received stock price : $" + price);
        }).join();
        api1Results3.thenAccept(price -> {
            System.out.println("Received stock price : $" + price);
        }).join();

        System.out.println("main thread is free");


    }
}
