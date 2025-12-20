
import java.util.Scanner;

public class reversestr{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sc = s.nextLine();
        System.out.println(rev(sc, 0));;
        
    }
    static String rev(String sc,int idx){
        if(idx==sc.length()){
            return "";
        }
        String ans = rev(sc, idx+1);
        char ch = sc.charAt(idx);
        return ans+ch;
    }

}