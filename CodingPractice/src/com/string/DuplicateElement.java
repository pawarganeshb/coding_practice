package com.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3, 4, 5, 5}; // 1,2,5

        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> duplicate = new LinkedHashSet<>();
        for(int num : arr){
            if(duplicate.add(num)){
               if(!seen.contains(num)){
                   duplicate.add(num);
               }
            }

        }
        System.out.println(duplicate);
        System.out.println();
        boolean[] isDuplicate = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (isDuplicate[i]) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    isDuplicate[j] = true;
                }

            }
            if (count > 1) {
                System.out.print(arr[i] + " ");
            }


        }
    }
}
