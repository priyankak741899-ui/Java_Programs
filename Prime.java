import java.util.*;
public class main{
    public static boolean Prime(int n){
        if(n==1) return false;
        for(int i=2;i<=n/i;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Prime(n));
    }
}