package strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String str = "madam";
        usingPredefindMethods(str);
        usingStream(str);
    }
    private static void usingStream(String str){

        String rev = IntStream.range(0, str.length()).
                mapToObj(i -> str.charAt(str.length() - i - 1)).
                map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(rev.equals(str)?"Palindrome":"Not Palindrome");
    }

    private static void usingPredefindMethods(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev=str.charAt(i)+rev;
        }
        System.out.println(rev);
        if (str.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
