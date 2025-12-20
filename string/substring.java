
public class substring{
    public static void main(String[] args) {
        String sc = "AMANDA";
        for (int i = 0; i < 5; i++) {
            for(int j=i+1;j<=6;j++){
                System.out.println(sc.substring(i, j));
            }
            
        }
        
    }
}
