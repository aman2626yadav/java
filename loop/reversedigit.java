import java.util.Scanner;

public class reversedigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev =0;
        while(num>0){
            // int sum = num%10; or
           rev = rev*10 + num%10;
           num=num/10; 
            
        }
        System.out.println(rev);
    }
}