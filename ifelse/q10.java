import java.util.*;
public class q10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sp,cp;
    System.out.println("Enter profit: ");
    sp=sc.nextInt();
    System.out.println("enter loss: ");
    cp=sc.nextInt();
    if(sp>cp)
    {
        System.out.println("Profit");
    }
    else
    {
    if(cp>sp)
    {
        System.out.println("Loss");
    }
    else{
        System.out.println("none");
    }
    }
}    
}
