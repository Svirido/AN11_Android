public class TextFormater {

    public static int wordCount(String str) {
        int counter = 0;
        for (int i = 0; i != str.length(); i++) {
            if (str.charAt(i) == ' ')
                counter++;
        }
        return counter;
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
