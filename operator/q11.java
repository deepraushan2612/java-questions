import java.util.*;

public class q11 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Sap value of a= "+a);
        System.out.println("Swap value of b= "+b);
    }
    
}
