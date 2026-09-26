import java.util.*;
public class SORTED_CHECK{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("Enter the value of c:");
        int c=sc.nextInt();
        if(a<=b && b<=c){
            System.out.println("SORTED");
        }
        else if(a>=b && b>=c){
            System.out.println("SORTED");
        }
        else{
            System.out.println("NOTSORTED");
        }
    }
}