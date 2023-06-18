package org.example;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeTest {

    LeetCode leetCode = new LeetCode();

    @Test
    public void testFizzBuzz() {
        List<String> result = new ArrayList<>();
        result.add("1");
        result.add("2");
        result.add("Fizz");

        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("7");
        expected.add("8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("11");
        expected.add("Fizz");
        expected.add("13");
        expected.add("14");
        expected.add("FizzBuzz");
        List<String> answer = leetCode.fizzBuzz(3);
        List<String> actual = leetCode.fizzBuzz(15);
        Assert.assertEquals(result, answer);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTwoSum() {
        int[] input = {2, 7, 11, 15};
        int[] expected = {0, 1};
        int[] actual = leetCode.twoSum(input, 9);
        Assert.assertArrayEquals(expected, actual);

        int[] input1 = {3, 3};
        int[] expected1 = {0, 1};
        int[] actual1 = leetCode.twoSum(input1, 6);
        Assert.assertArrayEquals(expected1, actual1);

        int[] input3 = {3, 2, 4};
        int[] expected3 = {1, 2};
        int[] actual3 = leetCode.twoSum(input3, 6);
        Assert.assertArrayEquals(expected3, actual3);
    }

    @Test
    public void testCheckTwoSum() {
        int[] input = {2, 7, 11, 15};
        boolean actual = leetCode.checkTwoSum(input, 9);
        Assert.assertTrue(actual);

        int[] input1 = {3, 3};
        boolean actual1 = leetCode.checkTwoSum(input1, 6);
        Assert.assertTrue(actual1);

        int[] input3 = {3, 2, 4};
        boolean actual3 = leetCode.checkTwoSum(input3, 10);
        Assert.assertFalse(actual3);

    }

    @Test
    public void testTwoSumHashMap() {
        int[] input = {2, 7, 11, 15};
        int[] expected = {0, 1};
        int[] actual = leetCode.twoSumHashMap(input, 9);
        Assert.assertArrayEquals(expected, actual);

        int[] input1 = {3, 3};
        int[] expected1 = {0, 1};
        int[] actual1 = leetCode.twoSumHashMap(input1, 6);
        Assert.assertArrayEquals(expected1, actual1);

        int[] input3 = {3, 2, 4};
        int[] expected3 = {1, 2};
        int[] actual3 = leetCode.twoSumHashMap(input3, 6);
        Assert.assertArrayEquals(expected3, actual3);
    }
}
