package ThreadPool;

public class MainThread {
    public static void main(String[] args) {

        APIService apiService = new APIService();
        Thread thread = new Thread(apiService);

        System.out.println(apiService.getResult());
        thread.start();
        System.out.println("Main thread starts");
    }
}
