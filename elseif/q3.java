import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char a;
        System.out.println("Enter character: ");
        a=sc.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            System.out.println("Vowel");
        }
        else if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
    
}
