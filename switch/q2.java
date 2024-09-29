
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  choice;
        System.out.println("1. Coca - Rs 10");
        System.out.println("2. Juice - Rs 20");
        System.out.println("3. Tea - Rs 10");
        System.out.println("4. Choclate - Rs 25");
        System.out.println("Enter choice: ");
        choice=sc.nextInt();
        switch (choice) {
            case 1: System.out.println("Collect your coca");   
                     break;
           
            case 2: System.out.println("Collect your juice");   
                      break;

            case 3: System.out.println("Collect your tea");   
                      break;
            case 4: System.out.println("Collect your choclate");   
                      break;
        
            default:System.out.println("Enter valid input");
              
        }

    }
    
}
