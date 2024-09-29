import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st angle: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
        System.out.println("Enter 3rd number: ");
        c=sc.nextInt();
        if(a+b+c==180)
        {
            System.out.println("Valid triangle");
        }
        else
        {
            System.out.println("Not a valid triangle");
        }
    }
}
