package com.array;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4, 5, 6, 4};
        boolean[] isVisited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (isVisited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    isVisited[j] = true;
                }

            }
            if (count == 1) {
                System.out.println(arr[i]);
            }

        }
    }
}