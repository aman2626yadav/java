public class palandrom{
    public static void main(String[] args) {
        String sc = "madam";
        String rev = "";
        for (int i = sc.length()-1;  i>=0; i--) {
            rev =rev + sc.charAt(i);
            
        }
        // System.out.println(rev);
        if(sc.equals(rev)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        



    }
}