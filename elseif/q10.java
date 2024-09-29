import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double bill,unit,surcharge,total;
        System.out.println("Enter Units: " );
        unit=sc.nextDouble();
        if(unit<=50 )
        {
           bill=unit*0.50;
        }
       else if(unit <= 150 )
        {
           bill=unit*0.75;
        }
        else if(unit <= 250 )
        {
           bill=unit*1.20;
        }
        else 
        {
           bill = unit * 1.50;
        }
        
            surcharge=bill*0.2;
            total=bill+surcharge;
            System.out.println("Total elctricity bill = "+total);
    }
    
}


