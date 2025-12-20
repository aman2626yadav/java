public class anagram{
    public static void main(String[] args){
        String str1 ="listen";
        String str2 ="silent";
        str1 = str1.toLowerCase();
        str2= str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
            return;
        }
        char[] arr2 = str2.toCharArray();
        boolean isAnagram = true;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if(ch==arr2[j]){
                    arr2[j]= '*';
                    found = true;
                    break;
                }
                
            }
            if(!found){
                isAnagram = false;
                break;
            }
            
        }
        if(isAnagram){
            System.out.println("ANAGARAM");
        }else{
            System.out.println("not anagaram");
        }


    }
}