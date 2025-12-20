public class vowels{
    public static void main(String[] args) {
        String sc = "apple";
        int vol =0 ,cont =0;
        for (int i = 0; i < sc.length(); i++) {
            char ch = sc.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vol++;
                }else{
                    cont++;
                }
            }
            
        }
        System.out.println("vowles"+ vol);
        System.out.println("consonat"+ cont);
    }
}