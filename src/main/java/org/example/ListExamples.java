package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("kiwi");
//        printFruits(fruits);
        //List<Integer> -> mid, sum, max, min, second largest,
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(3);
        nums.add(4);
        nums.add(24);
        nums.add(2);
        mid(nums);
        sum(nums);
        max(nums);
        min(nums);
        secondLargest(nums);

    }




    private static void printFruits(List<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void mid(List<Integer> row) {
        int length = row.size();
        if (length % 2 == 0) {
            System.out.println("There no mid element");
        }
        else {
            int midTerm = (length-1)/2;
            System.out.println(row.get(midTerm));
        }
    }

    public static void sum(List<Integer> data) {
        int result = 0;
        for (int element : data) {
            result = result + element;
        }
        System.out.println(result);
    }

    public static void max(List<Integer> row) {
        int maximum = row.get(0);
        for (int index = 1; index < row.size(); index++) {
            if (maximum < row.get(index)) {
                maximum = row.get(index);
            }
        }
        System.out.println(maximum);
    }

    public static void min(List<Integer> row) {
        int minimum = row.get(0);
        for (int index = 1; index < row.size(); index++) {
            if (minimum > row.get(index)) {
                minimum = row.get(index);
            }
        }
        System.out.println(minimum);
    }

    public static void secondLargest(List<Integer> list) {
        int first_largest = list.get(0);
        int second_largest = 0;
        for (int index = 1; index < list.size(); index++) {
            if (first_largest < list.get(index)) {
                second_largest = first_largest;
                first_largest = list.get(index);
            }
            else if (second_largest < list.get(index)) {
                second_largest = list.get(index);
            }
        }
        System.out.println(second_largest);
    }
}
