package strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i)+rev;
        }
        System.out.println(str.equals(rev)?"Palindrome":"Not Palindrome");
    }
}
