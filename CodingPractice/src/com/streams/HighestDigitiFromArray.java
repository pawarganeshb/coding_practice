package com.streams;

import java.util.Arrays;
import java.util.Comparator;

public class HighestDigitiFromArray {
    public static void main(String[] args) {
        int[] arr = {73, 97, 81, 200, 8};
        Integer max = Arrays.stream(arr).boxed().max(Integer::compare).get();
        System.out.println("Max Digit: " + max);

        Integer secondMax = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder()).skip(1).limit(1)
                .findFirst().orElse(-1);
        System.out.println("Second max digit: " + secondMax);

        Integer thirdMax = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .limit(1)
                .findFirst()
                .orElse(-1);
        System.out.println("Third Max Digit: " + thirdMax);


    }
}
