package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {78,85,41,25,84,21,41};
        System.out.println("Original Array:"+Arrays.toString(arr));
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array: "+Arrays.toString(arr));

    }
}
