import java.util.*;
public class Pattern5{
    public static void Pattern(int n){
        int star=1,space=(n*2)-3;
        for(int i=0;i<n;i++){
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            if(i==n-1){
                star--;
            }
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            space-=2;
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