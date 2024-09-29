import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int math,phy,chem,bio,comp;
        float total,percentage;
        System.out.println("Enter maths marks: " );
        math=sc.nextInt();
        System.out.println("Enter phy marks: " );
        phy=sc.nextInt();
        System.out.println("Enter chem marks: " );
        chem=sc.nextInt();
        System.out.println("Enter bio marks: " );
        bio=sc.nextInt();
        System.out.println("Enter computer marks: " );
        comp=sc.nextInt();

        total=math+phy+comp+chem+bio;
        percentage=total/5;
        if(percentage>=90 )
        {
            System.out.println("Grade A");
        }
       else if(percentage>=80)
        {
            System.out.println("Grade B");
        }
        else if(percentage>=70)
        {
            System.out.println("Grade C");
        }
        else if(percentage>=60)
        {
            System.out.println("Grade D");
        }
        else if(percentage>=40)
        {
            System.out.println("Grade E");
        }
        
        else
        {
            System.out.println("Grade F");
        }

    }
    
}
