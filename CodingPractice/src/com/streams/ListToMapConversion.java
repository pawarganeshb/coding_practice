package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee("ganesh", "Ganesh123"),
                new Employee("sandip", "Sandip@123"),
                new Employee("sandip", "Sandip@123"),
                new Employee("avi", "avipawar")
        );
        Map<String, String> listToMap = emp.stream().collect(Collectors.toMap(
                Employee::getUsername,
                Employee::getPassword,
                (existing, duplicate) -> duplicate
        ));
        System.out.println(listToMap);
    }
}
