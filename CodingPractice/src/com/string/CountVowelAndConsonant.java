package com.string;

public class CountVowelAndConsonant {
    public static void main(String[] args) {
        String str = "Nimap Infotech";
        countVowel(str);
    }

    private static void countVowel(String str) {
        long vowelsCount = str.chars().filter(ch -> !((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))).count();
        long consonantCount = str.chars().filter(ch -> (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')).count();
        System.out.println("Consonant: " + vowelsCount);
        System.out.println("Vowels: " + consonantCount);


    }
}
