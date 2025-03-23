package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MultiThread {
    public static void main(String[] args) {
        APICallLogin apiCallLogin = new APICallLogin();
//        apiCallLogin.start();
        Thread api1 = new Thread(new APIRunnable());
        Thread api2 = new Thread(new APIRunnable());
        Thread api3 = new Thread(new APIRunnable());
        api1.start();
        api2.start();
        api3.start();

        List<String> names = new ArrayList<>();
        names.add("raju");names.add("ramu");names.add("raju");

        List<String> names2 = names.stream()
                .map(e->e.toUpperCase(Locale.US))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(names2);

        int[] arr = {1,2,3,-8};
        int k = Arrays.stream(arr).sum();
        System.out.println(k);

        int n = arr.length;
        int totalSum=0;

        for (int i = 0; i < n; i++) {
            int contribution = arr[i] * (i + 1) * (n - i);
            totalSum += contribution;
        }

        System.out.println(totalSum);


    }
}
