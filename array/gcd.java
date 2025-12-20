public class gcd{
    public static void main(String[] args) {
        int x=12;
        int y =16;
        for (int i = 12; i>=1; i--) {
            if(x%i==0&&y%i==0){
                System.out.println( "the gcd is" + i);
            break;
            }
            
        }
        
    }
}