//TASK 4
package Homework8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] args) {

        File file = new File("./Homework8/input_task4.txt");

        Set<String> uniqueWords = new HashSet<>();

        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter("\\W+");
            uniqueWords = scanner.tokens()
                    .map(String::toLowerCase)
                    .distinct()
                    .collect(Collectors.toSet());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Unique words in the txt:");
        uniqueWords.forEach(System.out::println);
    }
}



