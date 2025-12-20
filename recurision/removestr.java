public class removestr{
    public static void main(String[] args) {
        String s="aman";
        System.out.println(rem(s, 0));
        
    }
    static String rem(String s,int idx){
        if(idx==s.length()){
            return"";
        }
        String ans= rem(s, idx+1);
        char ch = s.charAt(idx);
        if(ch!='a'){
            return ch+ans;

        }else{
            return ans;
        }

    }
}