package com.array;

public class OccurrenceOfEachNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 2, 4, 5, 6, 4};

        boolean[] processed = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (processed[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    processed[j] = true;
                }
            }
            System.out.println(arr[i] + ":" + count);

        }
    }
}
