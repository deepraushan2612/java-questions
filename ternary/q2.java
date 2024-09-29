import java.util.*;
public class q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter year: ");
        year=sc.nextInt();
        (year%400==0 || year%4==0 && year%100!=0 )? System.out.println("Leap year"):
                                                    System.out.println("Not a leap year");
}

}