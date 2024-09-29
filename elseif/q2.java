import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char a;
        System.out.println("Enter a character: ");
        a=sc.next().charAt(0);
        if(a>='A' && a<='Z')
        {
            System.out.println("Alphabet");
        }
       else  if(a>='a' && a<='z')
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Not alphabet");
        }
    }
    
}
