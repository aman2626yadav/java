public class convert {
    public static void main(String[] args) {
        String sc = "HeLlO";
        String result = "";  // start with empty string

        for (int i = 0; i < sc.length(); i++) {
            char ch = sc.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch; // keep digits/symbols as it is
            }
        }

        System.out.println("Original: " + sc);
        System.out.println("Converted: " + result);
    }
}
