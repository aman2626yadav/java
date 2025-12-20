
import java.util.Scanner;

public class otable{
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
      mul(k, n);

     }
     static void mul(int k,int n){
        if(k==0){
            return;
        }
       mul(k-1,n);
       System.out.println(n*k);
     }
}