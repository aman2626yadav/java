
import java.util.Scanner;

public class printnnum{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n  = sc.nextInt();
     print(n);

 }
//  static int print(int n){
//     if(n==0){
//         return n;
//     }
//     System.out.println(n);
//     return print(n-1); 
//     outout 5,4,3,2,1;
 static void  print(int n){
    if(n==0){
       return;
    }
        print(n-1); 
    System.out.println(n);
    // output 1,2,3,4,5 n=5
  
 }
}