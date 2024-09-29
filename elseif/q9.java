import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double gross_salary,HRA,DA;
        float basic_salary;
        
        System.out.println("Enter Basic salary: " );
        basic_salary=sc.nextFloat();
        if(basic_salary<=10000 )
        {
            HRA=basic_salary * 0.2;
            DA= basic_salary * 0.8;
        }
       else if(basic_salary>=10001 && basic_salary<=20000 )
        {
            HRA=basic_salary*0.25;
            DA=basic_salary*0.9;
        }
        else 
        {
            HRA=basic_salary*0.3;
            DA=basic_salary*0.95;
        }
        
       
         gross_salary=basic_salary+HRA+DA;
            System.out.println("Gross salary = "+gross_salary);
    }
    
}

