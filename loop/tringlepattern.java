import java.util.Scanner;

public class tringlepattern{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        // int col= sc.nextInt();
        for(int i =1;i<=row;i++){
            for (int j = 1; j <=row-i; j++) {
                System.out.println("*");
                
            }
            System.out.println( );

        }
    }
}