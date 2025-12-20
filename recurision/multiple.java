public class multiple{
     public static void main(String[] args){
        System.out.println(mul(5, 4));

     }
     static int mul(int k,int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
       return k + mul(k, n-1);
     }
}