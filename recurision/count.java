public class count{
    public static void main(String[] args) {
      System.out.println(count(45678));
        
    }
    static int  count(int n){
        
        if(n>=0&&n<=9){
            return 1;
        }
       return  count(n/10) +1;
        
    }
}
