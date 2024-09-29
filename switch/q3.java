
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  a,b,choice;
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number");
        b=sc.nextInt();
        System.out.println("Enter 1 for addition ");
        System.out.println("Enter 2  for substraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter choice: ");
        choice=sc.nextInt();
        switch (choice) {
            case 1: System.out.println("sum = "+(a+b));   
                     break;
           
            case 2: System.out.println("sub = "+(a-b));   
                      break;

            case 3: System.out.println("product = "+(a*b));   
                      break;
            case 4: System.out.println("quotient = "+(a/b));   
                      break;
        
            default:System.out.println("Enter valid input");
              
        }

    }
    
}

