package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("kiwi");
        System.out.println(countWords(fruits));

    }


    public static Map<String, Integer> countWords(List<String> input) {
        Map<String, Integer> output = new HashMap<>();
        for (String element : input) {
            if (output.containsKey(element)) {
                output.put(element, output.get(element) + 1);
            }
            else {
                output.put(element, 1);
            }
        }
        return output;
    }
}
