import java.util.*;         //header file
public class q2 {           //class name
    public static void main(String args[])  
    {
        Scanner sc=new Scanner(System.in);      //input scanner
        int num1,num2;
        System.out.println("Enter 1st number: ");
        num1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        num2=sc.nextInt();
        if(num1>=num2)
        {
           System.out.println("Max = "+num1);  
        } 
        else{
            System.out.println("Max = "+num2);
        } 
    }
}
