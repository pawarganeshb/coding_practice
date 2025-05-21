package com.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipElement {
    public static void main(String[] args) {
        List<Integer> limit = Stream.of(1, 2, 3, 4, 5).limit(3).collect(Collectors.toList());
        System.out.println(limit);
        List<Integer> skip = Stream.of(1, 2, 3, 4, 5).skip(3).collect(Collectors.toList());
        System.out.println(skip);

    }
}
