import java.util.*;
public class q6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        b=++a;
        c=a++;
       
        System.out.println("Pre-increment"+b);
        System.out.println("Post-increment"+c);
    }
} 
