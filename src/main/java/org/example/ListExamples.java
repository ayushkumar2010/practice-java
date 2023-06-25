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
//        List<Integer> nums = new ArrayList<>();
//        nums.add(10);
//        nums.add(3);
//        nums.add(4);
//        nums.add(24);
//        nums.add(2);
//        mid(nums);
//        sum(nums);
//        max(nums);
//        min(nums);
//        secondLargest(nums);
//        st("abc");

    }




    private static void printFruits(List<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }


}
