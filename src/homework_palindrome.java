import java.util.Scanner;

public class homework_palindrome {
    public static void main(String[] args) {

        int x;
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if (x<10){
            System.out.println("Number cannot be less than 10");
        }
        StringBuffer y= new StringBuffer(String.valueOf(x));
        System.out.println("Palindrome number is " + Integer.parseInt(y.reverse().toString()));

        int q = Integer.parseInt(y.toString());

       if (q==x) {
           System.out.println("True");
       }
       else {
           System.out.println("False");
       }


    }
}
