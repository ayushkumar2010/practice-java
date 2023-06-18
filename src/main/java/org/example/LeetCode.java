package org.example;

import java.util.*;

public class LeetCode {
    public List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>();
        for (int num = 1; num<= n ; num++) {
            if (num % 3 == 0 && num % 5 == 0 ){
                result.add("FizzBuzz");
            }
            else if (num % 3 == 0) {
                result.add("Fizz");
            }
            else if (num % 5 == 0) {
                result.add("Buzz");
            }
            else{
                result.add(String.valueOf(num));
            }
        }
        return (result);
    }

    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int index1 = 0; index1 < nums.length - 1; index1++) {
            for (int index2 = index1 + 1; index2 < nums.length; index2++){
                if ( nums[index1]  + nums[index2] == target){
                    result[0] = index1 ;
                    result[1] = index2 ;
                    break;
                }
            }
        }
        return result;
    }

    public int[] twoSumHashMap(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int diff = target - nums[index];
            if (indexMap.containsKey(diff)) {
                result[0] = indexMap.get(diff);
                result[1] = index;
                return result;
            }
            else indexMap.put(nums[index], index);
        }
        return result;
    }

    public boolean checkTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while ( left < right){
            int sum = nums[left] + nums[right];
            if ( sum == target) return true;
            else if (sum > target) right--;
            else left++;
            }
        return false;
        }
}

