package com.streams;

import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateChars {
    public static void main(String[] args) {
        String str = "Development";

        approach1(str);
        approach2(str);
    }

    private static void approach2(String str) {
        int[] freq = new int[256];

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + ":" + freq[i]);
            }

        }
    }

    private static void approach1(String str) {
        str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ch -> ch.getValue() > 2)
                .forEach(System.out::println);
    }
}

