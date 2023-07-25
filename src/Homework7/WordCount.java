//TASK 5
package Homework7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {

        Map<String, Integer> wordCounts = new HashMap<>();

        String filePath = "./Homework7/input_task5.txt";

        try {
            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNext()) {
                String word = scanner.next();

                if (wordCounts.containsKey(word)) {
                    int count = wordCounts.get(word);
                    wordCounts.put(word, count + 1);
                } else {

                    wordCounts.put(word, 1);
                }
            }

            for (String word : wordCounts.keySet()) {
                int count = wordCounts.get(word);
                System.out.println(word + ": " + count);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }
}
