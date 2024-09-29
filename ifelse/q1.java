import java.util.Scanner;

public class q1 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }

}
