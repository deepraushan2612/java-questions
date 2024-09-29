import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter year: ");
        year=sc.nextInt();
        if(year%400==0)
        {
            System.out.println("Leap year");
        }
        else if(year%4==0 && year%100!=0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }

    // int[] arr = new int[4]; 

    //     for(int i=0; i<arr.length; i++) {
    //         int x = sc.nextInt();
    //         if(x == 0 || x == 1) {
    //             arr[i] = x;
    //         } else {
    //             System.out.println(x + " invalid number");
    //             i--;
    //         }
    //     }
    //     for(int i=0; i<arr.length; i++) {
    //         System.out.println(arr);
    //     }
    }
    
}
