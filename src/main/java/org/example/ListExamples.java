package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class ListExamples {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
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
//        Using recursion
        System.out.println(isPalindrome("daddd"));
        System.out.println(factorial(10));
        System.out.println(fibonacci(3));


//        Without Using recursion
        System.out.println(isPalindromes("daddd"));
        System.out.println(factorials(10));
        System.out.println(fibonaccis(3));

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
        if (str.charAt(0) == str.charAt(str.length()-1)) {
            return isPalindrome(str.substring(1, str.length() - 2));
        }
        else return false;
    }


    public static int factorial(int n){
        if (n == 0 || n ==1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int nthTerm){
        if (nthTerm == 1 || nthTerm == 2) return 1;
        return fibonacci(nthTerm - 1) + fibonacci(nthTerm - 2);
    }


    public static boolean isPalindromes(String str) {
        int leftPoint = 0;
        int rightPoint = str.length()-1;
        while (leftPoint < rightPoint) {
            if (str.charAt(leftPoint) == str.charAt(rightPoint)) {
                leftPoint = leftPoint + 1;
                rightPoint = rightPoint - 1;
            }
            else return false;
        }
        return true;
    }

    public static int factorials(int n) {
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
            nthTerm = nthTerm -1;
        }
        return curr;
    }

}
