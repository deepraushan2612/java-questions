import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("Divisible by both 3 and 5");
        }
        else
        {
            System.out.println("Not divisible by both");
        }
    }
    
}
