import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int year;
       System.out.println("Enter year: ");
       year=sc.nextInt();
       if(year%400==0 || year%4==0 && year!=0)
       {
        System.out.println("Leap year");
       }
       else
       {
        System.out.println("Not leap year");
       }

        System.out.println();
    }
}
