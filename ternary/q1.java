import java.util.*;
public class q1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,min;
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
        min=(a<b)?(a):(b);
        System.out.println("Min = "+min);

    }
}
