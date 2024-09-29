import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  choice;
        
        System.out.println("Enter no. of day : ");
        choice=sc.nextInt();
        switch (choice) {
            case 1: System.out.println("Monday");   
                     break;
           
            case 2: System.out.println("Tuesday");   
                      break;

            case 3: System.out.println("wednesday");   
                      break;
            case 4: System.out.println("Thursday");   
                      break;
            case 5: System.out.println("Friday");   
                    break;
            case 6: System.out.println("Saturday");   
                    break;
            case 7: System.out.println("Sunday");   
                    break;
        
            default:System.out.println("Enter valid input");
              
        }

    }
    
}

