
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  a,b;
        char choice;
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter choice: ");
        choice=sc.next().charAt(0);
        System.out.println("Enter 2nd number");
        b=sc.nextInt();
       
        switch (choice) {
            case '+': System.out.println("sum = "+(a+b));   
                     break;
           
            case '-': System.out.println("sub = "+(a-b));   
                      break;

            case '*': System.out.println("product = "+(a*b));   
                      break;
            case '/': System.out.println("quotient = "+(a/b));   
                      break;
        
            default:System.out.println("Enter valid input");
              
        }

    }
    
}


