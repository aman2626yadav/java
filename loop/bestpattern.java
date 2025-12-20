import java.util.Scanner;

public class bestpattern{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col= sc.nextInt();
        for(int i =1;i<=row;i++){
            for (int j = 1; j <=col; j++) {
                if((i+j)%2==0){
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }   
            }
            System.out.println( );

        }
    }
}