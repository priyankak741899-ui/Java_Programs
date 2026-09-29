import java.util.*;
public class Pattern4{
    public static void Pattern(int n){
        int star=n,space=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            space++;
            star--;
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