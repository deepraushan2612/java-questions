import java.util.Scanner;

public class q5{
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        if(num>0)
        {
        System.out.println("Positive");
        }
       
       else
       { 
        if(num==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negative");
        }
       }
    } 
}
