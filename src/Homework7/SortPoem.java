//TASK 3
package Homework7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortPoem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> lines = new ArrayList<>();

        System.out.println("Enter a poem (Type '0' on a new line to terminate the program):");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("0")) {
                break;
            }
            lines.add(line);
        }

        lines.sort(Comparator.comparing(String::length));

        System.out.println("Sorted poem(by its length) is as follows:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
