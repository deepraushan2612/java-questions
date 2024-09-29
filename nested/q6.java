import java.util.*;

class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("Enter month no. [1 - 12]");
        month=sc.nextInt();
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
        {
            System.out.println("NO. of days = 31");
        }
        else
        {
            if(month==2)
            {
                System.out.println("28 days");
            }
            else
            {
                System.out.println("30 days");
            }
        }
    }

    
}