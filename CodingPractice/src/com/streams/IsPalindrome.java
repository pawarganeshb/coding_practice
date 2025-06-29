package com.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class IsPalindrome {
    public static void main(String[] args) {
        String[] str = {"madam", "level", "racecar", "java", "hi "};
        approach1(str);
    }

    private static void approach1(String[] str) {
        Stream<String> palindrome = Arrays.stream(str)
                .filter(t -> t.contentEquals(new StringBuilder(t).reverse()));
        palindrome.forEach(System.out::println);
    }
}
