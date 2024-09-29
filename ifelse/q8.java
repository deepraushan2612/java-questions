import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        if(num%11==0 && num%5==0)
        {
            System.out.println("Divisible by both 5 and 11");
        }
        else
        {
            System.out.println("Not divisible by both");
        }
    }
    
}
