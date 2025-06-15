package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindSumOfDistinct {
    public static void main(String[] args) {
        int[] arr = {10, 15, 15, 20, 10, 30};
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(map);
        int sum = 0;


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }

        System.out.println(sum);
    }
}
