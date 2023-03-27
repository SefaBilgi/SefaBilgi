import java.util.*;
class FizzBuzz
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        if (n%15==0)
            System.out.println("Fizz-Buzz");
        else if (n%5==0)
            System.out.println("Buzz");
        else if (n%3==0)
            System.out.println("Fizz");

    }
}