package com.string;

public class CountCharDigitSymbol {
    public static void main(String[] args) {
        String str = "Ganesh@123$890";

        countEachCharSymDigit(str);
        System.out.println("============");
        countEachCharSymDigitUsingMethod(str);
        System.out.println("============");
        usingStream(str);
    }

    private static void usingStream(String str) {
        long alphaCount = str.chars().filter(ch -> (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                .count();
        long numericCount = str.chars().filter(ch -> (ch >= '0' && ch <= '9')).count();
        long spaSymbol = str.chars().
                filter(ch->!(Character.isDigit(ch) || Character.isAlphabetic(ch))).
                count();


        System.out.println("Char Count: "+alphaCount);
        System.out.println("Digit Count: "+numericCount);
        System.out.println("Symbol Count: "+spaSymbol);
    }

    private static void countEachCharSymDigitUsingMethod(String str) {
        int symCount = 0;
        int digitCount = 0;
        int charCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                charCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;

            } else {
                symCount++;
            }
        }
        System.out.println("Symbol Count: " + symCount);
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Char Count: " + charCount);
    }

    private static void countEachCharSymDigit(String str) {
        int symCount = 0;
        int digitCount = 0;
        int charCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                charCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else {
                symCount++;
            }

        }
        System.out.println("Symbol Count: " + symCount);
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Char Count: " + charCount);
    }
}
