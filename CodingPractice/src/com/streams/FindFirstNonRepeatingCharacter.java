package com.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        approach1(str);
        approach2(str);
    }

    private static void approach2(String str) {
        int[] freq = new int[256];

        for (char i:str.toCharArray()) {
            freq[i]++;
        }
        for (char ch :str.toCharArray()) {
            if(freq[ch] == 1){
                System.out.println(ch);
                return;
            }

        }
    }

    private static void approach1(String str) {
        Map.Entry<Character, Long> characterLongEntry = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get();
        System.out.println(characterLongEntry.getKey());


    }
}
