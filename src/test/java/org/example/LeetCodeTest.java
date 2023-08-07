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
        int[] input1 = {2, 7, 11, 15};
        int[] expected1 = {0, 1};
        int[] actual1 = leetCode.twoSum(input1, 9);
        Assert.assertArrayEquals(expected1, actual1);

        int[] input2 = {3, 3};
        int[] expected2 = {0, 1};
        int[] actual2 = leetCode.twoSum(input2, 6);
        Assert.assertArrayEquals(expected2, actual2);

        int[] input3 = {3, 2, 4};
        int[] expected3 = {1, 2};
        int[] actual3 = leetCode.twoSum(input3, 6);
        Assert.assertArrayEquals(expected3, actual3);
    }

    @Test
    public void testCheckTwoSum() {
        int[] input1 = {2, 7, 11, 15};
        boolean actual1 = leetCode.checkTwoSum(input1, 9);
        Assert.assertTrue(actual1);

        int[] input2 = {3, 3};
        boolean actual2 = leetCode.checkTwoSum(input2, 6);
        Assert.assertTrue(actual2);

        int[] input3 = {3, 2, 4};
        boolean actual3 = leetCode.checkTwoSum(input3, 10);
        Assert.assertFalse(actual3);

    }

    @Test
    public void testTwoSumHashMap() {
        int[] input1 = {2, 7, 11, 15};
        int[] expected1 = {0, 1};
        int[] actual1 = leetCode.twoSumHashMap(input1, 9);
        Assert.assertArrayEquals(expected1, actual1);

        int[] input2 = {3, 3};
        int[] expected2 = {0, 1};
        int[] actual2 = leetCode.twoSumHashMap(input2, 6);
        Assert.assertArrayEquals(expected2, actual2);

        int[] input3 = {3, 2, 4};
        int[] expected3 = {1, 2};
        int[] actual3 = leetCode.twoSumHashMap(input3, 6);
        Assert.assertArrayEquals(expected3, actual3);
    }

    @Test
    public void testIsPalindrome() {
        int input1 = 121;
        boolean actual1 = leetCode.isPalindrome(input1);
        Assert.assertTrue(actual1);

        int input2 = -121;
        boolean actual2 = leetCode.isPalindrome(input2);
        Assert.assertFalse(actual2);

        int input3 = 10;
        boolean actual3 = leetCode.isPalindrome(input3);
        Assert.assertFalse(actual3);
    }
// Today 20 June
    @Test
    public void testTwoSum2() {
        int[] input1 = {2, 7, 11, 15};
        int[] expected1 = {1, 2};
        int[] actual1 = leetCode.twoSum2(input1, 9);
        Assert.assertArrayEquals(expected1, actual1);

        int[] input2 = {2, 3,4};
        int[] expected2 = {1, 3};
        int[] actual2 = leetCode.twoSum2(input2, 6);
        Assert.assertArrayEquals(expected2, actual2);

        int[] input3 = {-1, 0};
        int[] expected3 = {1, 2};
        int[] actual3 = leetCode.twoSum2(input3, -1);
        Assert.assertArrayEquals(expected3, actual3);
    }

    @Test
    public void testRomanToInt() {
        String input1 = "III";
        int expected1 = 3;
        int actual1 = leetCode.romanToInt(input1);
        Assert.assertEquals(expected1, actual1);

        String input2 = "LVIII";
        int expected2 = 58;
        int actual2 = leetCode.romanToInt(input2);
        Assert.assertEquals(expected2, actual2);

        String input3 = "MCMXCIV";
        int expected3 = 1994;
        int actual3 = leetCode.romanToInt(input3);
        Assert.assertEquals(expected3, actual3);
    }
// Today 21 June

    @Test
    public void testLongestCommonPrefix() {
        String[] input1 = {"flower","flowerpt","flow"} ;
        String expected1 = "flow";
        String actual1 = leetCode.longestCommonPrefix(input1);
        Assert.assertEquals(expected1, actual1);

        String[] input2 = {"dog","racecar","car"} ;
        String expected2 = "";
        String actual2 = leetCode.longestCommonPrefix(input2);
        Assert.assertEquals(expected2, actual2);

        String[] input3 = {"a","a","b"} ;
        String expected3 = "";
        String actual3 = leetCode.longestCommonPrefix(input3);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIsValid() {
        String input1 = "()";
        boolean actual1 = leetCode.isValid(input1);
        Assert.assertTrue(actual1);

        String input2 = "()[]{}";
        boolean actual2 = leetCode.isValid(input2);
        Assert.assertTrue(actual2);

        String input3 = ")";
        boolean actual3 = leetCode.isValid(input3);
        Assert.assertFalse(actual3);
    }
// Today 25 June

    @Test
    public void testLengthOFLastWord() {
        String input1 = "Hello World";
        int expected1 = 5;
        int actual1 = leetCode.lengthOfLastWord(input1);
        Assert.assertEquals(expected1, actual1);

        String input2 = "   fly me   to   the moon  ";
        int expected2 = 4;
        int actual2 = leetCode.lengthOfLastWord(input2);
        Assert.assertEquals(expected2, actual2);

        String input3 = "luffy is still joyboy";
        int expected3 = 6;
        int actual3 = leetCode.lengthOfLastWord(input3);
        Assert.assertEquals(expected3, actual3);

        String input4 = "a";
        int expected4 = 1;
        int actual4 = leetCode.lengthOfLastWord(input4);
        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void testRemoveDuplicates() {
        int[] input1 = {1,1,2};
        int expected1 = 2;
        int actual1 = leetCode.removeDuplicates(input1);
        Assert.assertEquals(expected1, actual1);

        int[] input2 = {0,0,1,1,1,2,2,3,3,4};
        int expected2 = 5;
        int actual2 = leetCode.removeDuplicates(input2);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testSearchInsert() {
        int[] input1 = {1,3};
        int expected1 = 0;
        int actual1 = leetCode.searchInsert(input1, 1);
        Assert.assertEquals(expected1, actual1);

        int[] input2 = {1,3,5,6,7,9,11};
        int expected2 = 7;
        int actual2 = leetCode.searchInsert(input2, 12);
        Assert.assertEquals(expected2, actual2);

        int[] input3 = {1,3,5,7,9};
        int expected3 = 5;
        int actual3 = leetCode.searchInsert(input3, 10);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testStrStr() {
        String input1 = "saadbutsad";
        String input2 = "sad";
        int expected1 = 7;
        int actual1 = leetCode.strStr(input1, input2);
        Assert.assertEquals(expected1, actual1);

        String input3 = "aabbc";
        String input4 = "abc";
        int expected2 = -1;
        int actual2 = leetCode.strStr(input3, input4);
        Assert.assertEquals(expected2, actual2);

        String input5 = "mississippi";
        String input6 = "issipi";
        int expected3 = -1;
        int actual3 = leetCode.strStr(input5, input6);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testPlusOne() {
        int[] input1 = {1, 2, 9};
        int[] expected1 = {1, 3, 0};
        int[] actual1 = leetCode.plusOne(input1);
        Assert.assertArrayEquals(expected1, actual1);

        int[] input2 = {4, 3, 2, 1};
        int[] expected2 = {4, 3, 2, 2};
        int[] actual2 = leetCode.plusOne(input2);
        Assert.assertArrayEquals(expected2, actual2);

        int[] input3 = {9, 9};
        int[] expected3 = {1, 0, 0};
        int[] actual3 = leetCode.plusOne(input3);
        Assert.assertArrayEquals(expected3, actual3);
    }
    @Test
    public void testAddBinary() {
        String input1 = "11" ;
        String input2 = "1" ;
        String expected1 = "100";
        String actual1 = leetCode.addBinary(input1, input2);
        Assert.assertEquals(expected1, actual1);

        String input3 = "1010" ;
        String input4 = "11" ;
        String expected2 = "1101";
        String actual2 = leetCode.addBinary(input3, input4);
        Assert.assertEquals(expected2, actual2);

        String input5 = "0" ;
        String input6 = "0" ;
        String expected3 = "0";
        String actual3 = leetCode.addBinary(input5, input6);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIntSqrt() {
        int input1 = 2;
        int expected1 = 1;
        int actual1 = leetCode.intSqrt(input1);
        Assert.assertEquals(expected1, actual1);

        int input2 = 5;
        int expected2 = 2;
        int actual2 = leetCode.intSqrt(input2);
        Assert.assertEquals(expected2, actual2);

        int input3 = 2147483647;
        int expected3 = 4;
        int actual3 = leetCode.intSqrt(input3);
        Assert.assertEquals(expected3, actual3);
    }
    @Test
    public void testClimbStairs() {
        int input1 = 2;
        int expected1 = 2;
        int actual1 = leetCode.climbStairs(input1);
        Assert.assertEquals(expected1, actual1);

        int input2 = 3;
        int expected2 = 3;
        int actual2 = leetCode.climbStairs(input2);
        Assert.assertEquals(expected2, actual2);

        int input3 = 5;
        int expected3 = 8;
        int actual3 = leetCode.climbStairs(input3);
        Assert.assertEquals(expected3, actual3);
    }
    @Test
    public void testRemoveElement() {
        int[] input1 = {3,2,2,3};
        int input2 = 3;
        int expected1 = 2;
        int actual1 = leetCode.removeElement(input1, input2);
        Assert.assertEquals(expected1, actual1);

        int[] input3 = {0,1,2,2,3,0,4,2};
        int input4 = 2;
        int expected2 = 5;
        int actual2 = leetCode.removeElement(input3, input4);
        Assert.assertEquals(expected2, actual2);
    }
    @Test
    public void testLengthOfLongestSubstring() {
        String input1 = "abcabcbb";
        int expected1 = 3;
        int actual1 = leetCode.lengthOfLongestSubstring(input1);
        Assert.assertEquals(expected1, actual1);

        String input2 = "bbbbb";
        int expected2 = 1;
        int actual2 = leetCode.lengthOfLongestSubstring(input2);
        Assert.assertEquals(expected2, actual2);

        String input3 = "pwwkew";
        int expected3 = 3;
        int actual3 = leetCode.lengthOfLongestSubstring(input3);
        Assert.assertEquals(expected3, actual3);

        String input4 = "a";
        int expected4 = 1;
        int actual4 = leetCode.lengthOfLongestSubstring(input4);
        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void testIntToRoman() {
        int input1 = 3;
        String expected1 = "III";
        String actual1 = leetCode.intToRoman(input1);
        Assert.assertEquals(expected1, actual1);

        int input2 = 58;
        String expected2 = "LVIII";
        String actual2 = leetCode.intToRoman(input2);
        Assert.assertEquals(expected2, actual2);

        int input3 = 1994;
        String expected3 = "MCMXCIV" ;
        String actual3 = leetCode.intToRoman(input3);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIsHappy() {
        int input1 = 19;
        boolean actual1 = leetCode.isHappy(input1);
        Assert.assertTrue(actual1);

        int input2 = 2;
        boolean actual2 = leetCode.isHappy(input2);
        Assert.assertFalse(actual2);

        int input3 = 104;
        boolean actual3 = leetCode.isHappy(input3);
        Assert.assertFalse(actual3);
    }

}
