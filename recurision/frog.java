public class frog{
    public static void main(String[] args){
        int[] h  ={10,30,40,20};
        int n = h.length;
        System.out.println(base(h,n,0));

    }
    static int base(int[] h , int n,int idx){
        if (idx==n-1) {
           return 0;   
        }
        int op1 = base(h, n, idx+1)+ Math.abs(h[idx+1] - h[idx]);
        if(idx==n-2) {
            return op1; }
        int op2 = base(h,n,idx+2)+Math.abs(h[idx+2]-h[idx]);
        return Math.min(op1,op2);
    }
}