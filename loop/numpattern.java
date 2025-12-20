import java.util.Scanner;

public class numpattern{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        // int col= sc.nextInt();
        for(int i =1;i<=row;i++){
            for (int j = i; j <=row; j++) {
                System.out.println(j);
                
            }
            for (int k = 1; k <= i-1; k++) {
                System.out.println(k);
                
            }
            System.out.println( );

        }
    }
}