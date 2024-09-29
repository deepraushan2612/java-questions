
import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st side: " );
        a=sc.nextInt();
        System.out.println("Enter 2nd side: " );
        b=sc.nextInt();
        System.out.println("Enter 3rd side: " );
        c=sc.nextInt();
        if(a+b>c && b+c>a && a+c>b)
        {
            System.out.println("Valid triangle");
        }
        
        else
        {
            System.out.println("Not a valid triangle ");
        }

    }
    
}
