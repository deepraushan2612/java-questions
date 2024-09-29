import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
        System.out.println("Enter 3rd number: ");
        c=sc.nextInt();
        System.out.println("Enter 4th number: ");
        d=sc.nextInt();
        
        if(a>b)
        {
            if(a>c)
            {   
                if(a>d)
                {
                    System.out.println(" a is greatest");
                }
                else
                {
                    System.out.println("d is greatest");
                }

            }
            else
            {
                if(c>d)
                {
                    System.out.println("c is greatest");
                }
                else
                {
                    System.out.println("d is greatest");
                }

            }
        }
        else
        {
            if(b>c)
            {
                if(b>d)
                {
                System.out.println("b is greatest");
                }
                else
                {
                System.out.println("d is greatest");
                }
            }
            else
            {
                if(c>d)
                {
                    System.out.println("c is greatest");
                }
                else
                {
                    System.out.println("d is greatest");
                }
            }
        }

    }
    
}
