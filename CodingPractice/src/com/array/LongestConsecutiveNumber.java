package com.array;

public class LongestConsecutiveNumber {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 3, 3, 2, 1, 1, 1, 2, 2, 2, 2, 2};
        int currentDigit = arr[0];
        int currentCount = 1;

        int maxDigit = arr[0];
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentDigit) {
                currentCount++;
            } else {
                currentDigit = arr[i + 1];
                currentCount = 1;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxDigit = currentDigit;
            }
        }
        System.out.println(maxDigit + ":" + maxCount);
    }
}
