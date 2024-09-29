import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char a;
        System.out.println("Enter a character: " );
        a=sc.next().charAt(0);
        if(a>='A' && a<='Z'|| a>='a' && a<='z')
        {
            System.out.println("Alphabet");
        }
        else if(a>='0' && a<='9')
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character ");
        }

    }
    
}
