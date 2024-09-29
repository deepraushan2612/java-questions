import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter a number: ");
        num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("Max = "+num1);
        }
        else
        {
            System.out.println("Max = "+num2);
        }
    }
}
