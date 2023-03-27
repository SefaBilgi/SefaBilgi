import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homework_LenghtOfTheLastWord {
    public static int length(String str) {
        List<String> lis = new ArrayList<>();
        String word = "";
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                lis.add(word);
                word = "";
            } else {
                word += c;
            }
        }
        lis.add(word);
        return lis.get(lis.size() - 1).length();
    }

    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("The length of last word is " + length(str));
    }
}