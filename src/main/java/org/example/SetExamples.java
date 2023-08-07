package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(3);
        nums.add(4);
        nums.add(24);
        nums.add(24);
        nums.add(2);
        nums.add(2);
        for (int i = 0; i < 100000; i++) {
            nums.add(i);
        }
        Long start = System.currentTimeMillis();
        removeDuplicates(nums);
        Long end = System.currentTimeMillis();
        System.out.println("Time taken = " + (end-start));
    }

    public static List<Integer> removeDuplicates(List<Integer> inputList) {
        List<Integer> outputList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
//        List<Integer> set = new ArrayList<>();
        for (Integer i : inputList) {
            if (!set.contains(i)) {
                outputList.add(i);
                set.add(i);
            }
        }
        return outputList;
    }


}
