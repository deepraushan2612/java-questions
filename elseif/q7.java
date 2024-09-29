import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st side: " );
        a=sc.nextInt();
        System.out.println("Enter 2nd side: " );
        b=sc.nextInt();
        System.out.println("Enter 3rd side: " );
        c=sc.nextInt();
        if(a==b && b==c )
        {
            System.out.println("Equilateral triangle");
        }
       else if(a!=b && b!=c && a!=c )
        {
            System.out.println("Scalen triangle");
        }
        
        else
        {
            System.out.println("Isosceles triangle ");
        }

    }
    
}
