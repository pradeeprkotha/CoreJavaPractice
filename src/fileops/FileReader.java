package fileops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileReader {
    public static void main(String[] args) {
        String filePath = "/Users/pradeepreddy/IdeaProjects/ProPractice/read_file.txt";

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines.forEach(System.out::println); // Process each line
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> list = new ArrayList<>();
        list.stream().forEach(e->{System.out.println(e);});
        sort();
    }

    public static void sort(){
        int[] arr = {1,3,2};
        int len = arr.length;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<len-i-1; j++){
                if(arr[j]>arr[j+1]){ // 3>2
                    int temp = arr[j]; //3
                    arr[j] =arr[j+1]; // 2
                    arr[j+1] = temp; // 3
                }

            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
