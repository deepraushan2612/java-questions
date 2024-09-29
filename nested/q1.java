import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st numbers: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd numbers: ");
        b=sc.nextInt();
        System.out.println("Enter 3rd numbers: ");
        c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is greatest");
            }
            else
            {
                System.out.println("c is greater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is greatest");
            }
            else
            {
                System.out.println("c is greatest");
            }

        }

    }    
}
