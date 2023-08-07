package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class ListExamples {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("kiwi");
//        printFruits(fruits);
        //List<Integer> -> mid, sum, max, min, second largest,
        List<Integer> nums = new ArrayList<>();
        int[] num = {4,5,1,2,6,7,9,3};
        nums.add(10);
        nums.add(3);
        nums.add(4);
        nums.add(24);
        nums.add(2);
//        mid(nums);
//        sum(nums);
//        max(nums);
//        min(nums);
//        secondLargest(nums);



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

    public static Integer add(List<Integer> data) {
        int sum = 0;
        for (int element : data) {
            sum = sum + element;
        }
        return sum;
    }


    public static Integer max(List<Integer> row) {
        int maximum = row.get(0);
        for (int index = 1; index < row.size(); index++) {
            if (maximum < row.get(index)) {
                maximum = row.get(index);
            }
        }
        return maximum;
    }

    public static Integer min(List<Integer> row) {
        int minimum = row.get(0);
        for (int index = 1; index < row.size(); index++) {
            if (minimum > row.get(index)) minimum = row.get(index);
        }
        return minimum;
    }

    public static Integer secondLargest(List<Integer> list) {
        int largest = list.get(0);
        int secondLargest = 0;
        for (Integer num : list) {
            if (largest < num) {
                secondLargest = largest;
                largest = num;
            }
            else if (secondLargest < num) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public int removeDuplicates(int[] nums) {
        int elements = 1;
        int fixed = nums[0];
        for (int num : nums) {
            if (fixed != num) {
                elements = elements + 1;
                fixed = num;
            }
        }
        return elements;
    }


/*Given an array arr[] and an integer K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array.
It is given that all array elements are distinct.*/


    public static Integer kthSmallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static boolean isPalindrome(String str){
        if (str.length() == 0 || str.length() == 1) return true;
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 2));
        }
        else return false;
    }


    public static int factorial(int n){
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int nthTerm){
        if (nthTerm == 1 || nthTerm == 2) return 1;
        return fibonacci(nthTerm - 1) + fibonacci(nthTerm - 2);
    }


    public static boolean isPalindromes(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left = left + 1;
                right = right - 1;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static int factorialIterative(int n) {
        int sum = 1;
        while (n > 0) {
            sum = sum * n;
            n = n - 1;
        }
        return sum;
    }

    public static int fibonaccis(int nthTerm) {
        int previous = 0;
        int curr = 1;
        while (nthTerm > 1) {
            curr = curr + previous;
            previous = curr - previous;
            nthTerm = nthTerm - 1;
        }
        return curr;
    }

    public static List<Integer> list2(int num) {
        List<Integer> bucket = new ArrayList<>();
        int[] values = {1000, 500, 100, 50, 10, 5, 1};
        int j = 0;
        int k = 2;
        while (num > 0) {
            if (num < values[k]){
                k = k + 2;
                j = k - 2;
            }
            else if ((num / values[j]) != 0) {
                for (int i = 0; i < (num / values[j]); i++) {
                    bucket.add(0, (values[j]));
                }
                num = num - ((num / values[j]) * values[j]);
            }

            else if (num / ((values[k]) * 9) == 1){
                bucket.add(0, values[k]);
                bucket.add(0, values[k-2]);
                num = num - (values[k-2] - values[k]);
            }
            else if ((num / values[j+1]) != 0) {
                for (int i = 0; i < (num / values[j+1]); i++) {
                    bucket.add(0, (values[j+1]));
                }
                num = num - ((num / values[j+1]) * values[j+1]);
            }
            else if (num / ((values[k]) * 4) == 1) {
                bucket.add(0, values[k]);
                bucket.add(0, values[k-1]);
                num = num - (values[k-1] - values[k]);
            }
            else {
                j++;
            }
        }
        return bucket;
    }



}
