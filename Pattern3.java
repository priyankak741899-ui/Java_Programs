import java.util.*;
public class Pattern3{
    public static void Pattern(int n){
        int star=1,space=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            space--;
            star++;
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern(n);
    }
}