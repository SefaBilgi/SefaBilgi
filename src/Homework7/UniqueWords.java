//TASK 4
package Homework7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {

        File file = new File("./Homework7/input_task4.txt");

        Set<String> uniqueWords = new HashSet<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String[] words = scanner.nextLine().split("\\s+");

                for (String word : words) {
                    uniqueWords.add(word);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Unique words in the txt:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
