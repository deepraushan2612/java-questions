import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char  a;
        
        System.out.println("Enter choice: ");
        a=sc.next().charAt(0);
        switch (a) {
            case 'a':
            case 'A': System.out.println("Vowel");   
                     break;
            case 'e':
            case 'E': System.out.println("Vowel");   
                      break;
            case 'i':
            case 'I': System.out.println("Vowel");   
                      break;
            case 'o':
            case 'O': System.out.println("Vowel");   
                      break;
            case 'u':
            case 'U': System.out.println("Vowel");   
                      break;
        
            default:System.out.println("Consonant");
              
        }

    }
    
}
