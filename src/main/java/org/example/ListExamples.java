package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("kiwi");
        printFruits(fruits);
        //List<Integer> -> mid, sum, max, min, second largest,
    }

    private static void printFruits(List<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
