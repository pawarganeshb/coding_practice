package com.string;

import java.util.stream.Collectors;

public class ToggleEachCharacter {
    public static void main(String[] args) {
        String str = "GaNeSH PaWaR";
        toggleWordUsingCharMethods(str);
        toggleWord(str);
        toggleWordUsingStream(str);
    }

    private static void toggleWordUsingStream(String str) {
        String toogleWords = str.chars().mapToObj(c -> {
                    if (c >= 'A' && c <= 'Z') {
                        return (char) (c + 32);
                    } else if (c >= 'a' && c <= 'z') {
                        return (char) (c - 32);
                    } else {
                        return (char) c;
                    }
                })
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(toogleWords);
    }

    private static void toggleWord(String str) {
        StringBuilder toggleWord = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                toggleWord.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                toggleWord.append((char) (ch - 32));
            } else {
                toggleWord.append(ch);
            }
        }
        System.out.println(toggleWord);
    }

    private static void toggleWordUsingCharMethods(String str) {
        StringBuilder toggleWord = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggleWord.append(Character.toLowerCase(ch));
            } else {
                toggleWord.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(toggleWord);
    }

    public static class CountCharDigitAndSymbol {
        public static void main(String[] args) {

        }
    }
}
