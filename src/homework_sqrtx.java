import java.util.Scanner;

class root {


    static int floorSqrt(int x)
    {
        if (x == 0 || x == 1)
            return x;

        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }


    public static void main(String[] args)
    {
        int x;
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        System.out.print(floorSqrt(x));
    }
}
