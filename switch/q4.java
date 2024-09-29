

import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char  choice;
        System.out.println("1.Red ");
        System.out.println("2.Green ");
        System.out.println("3.Yellow ");
        
        System.out.println("Enter choice: ");
        choice=sc.next().charAt(0);
        switch (choice) {
            case 'r':
            case 'R': System.out.println("stop");   
                     break;
            case 'g':
            case 'G': System.out.println("GO");   
                      break;
            case 'y':
            case 'Y': System.out.println("Alert");   
                      break;
        
            default:System.out.println("Enter valid input");
              
        }

    }
    
}
