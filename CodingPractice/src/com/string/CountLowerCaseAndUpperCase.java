package strings;

public class CountLowerCaseAndUpperCase {
    public static void main(String[] args) {
        String str = "Hello Word!";

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }
            else {
                lowerCaseCount++;
            }
        }
        System.out.println("LowerCase: "+lowerCaseCount+"\nUpperCase: "+upperCaseCount);
    }
}
