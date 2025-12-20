public class fabo{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
        System.out.println(fabo(i));
        // print all fabonacci
            
        }
        
    }
    static int fabo(int n){
        if(n==0||n==1) return n;
        return fabo(n-1)+fabo(n-2);
    }

}