import java.util.*;
public class Q3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,max;
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
        max=(a>b)?(a):(b);
        System.out.println("Max = "+max);

    }
}
