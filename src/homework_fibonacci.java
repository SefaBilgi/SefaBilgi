import java.util.Scanner;

class homework_fibonacci{
    public static void main(String args[])
    {
        int count;
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        count = in.nextInt();

        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }}