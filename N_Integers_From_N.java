import java.util.*;
public class N_Integers_From_N{
    public static void main(String[] args){
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i<(n+n);i++){
            System.out.print(i + " ");
        }
    }
} 