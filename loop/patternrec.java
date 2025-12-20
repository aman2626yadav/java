
import java.util.Scanner;

public class patternrec{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col= sc.nextInt();
        for(int i =1;i<=row;i++){
            for (int j = 1; j < col; j++) {
                if (i==1||i==row||j==col||j==1) {
                    System.out.println("*");
                    
                } else {
                    System.out.println(" ");
                }
                
            }
            System.out.println( );
        }

    }
}