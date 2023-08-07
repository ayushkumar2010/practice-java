package org.example;

import java.util.*;

public class LeetCode {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int num = 1; num <= n; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                result.add("FizzBuzz");
            } else if (num % 3 == 0) {
                result.add("Fizz");
            } else if (num % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(num));
            }
        }
        return (result);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int index1 = 0; index1 < nums.length - 1; index1++) {
            for (int index2 = index1 + 1; index2 < nums.length; index2++) {
                if (nums[index1] + nums[index2] == target) {
                    result[0] = index1;
                    result[1] = index2;
                    break;
                }
            }
        }
        return result;
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int diff = target - nums[index];
            if (indexMap.containsKey(diff)) {
                result[0] = indexMap.get(diff);
                result[1] = index;
                return result;
            } else indexMap.put(nums[index], index);
        }
        return result;
    }

    public boolean checkTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) return true;
            else if (sum > target) right--;
            else left++;
        }
        return false;
    }

    public boolean isPalindrome(int x) {
        int reverse = 0;
        int remainder = x;
        while (remainder > 0) {
            reverse = reverse * 10 + (remainder % 10);
            remainder = remainder / 10;
        }
        if (reverse == x) return true;
        else return false;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;
        while (leftIndex < rightIndex) {
            int sum = numbers[leftIndex] + numbers[rightIndex];
            if (sum == target) {
                result[0] = leftIndex + 1;
                result[1] = rightIndex + 1;
                return result;
            } else if (sum > target) rightIndex--;
            else leftIndex++;
        }
        return result;
    }

    public int romanToInt(String s) {
        Map<Character, Integer> table = new HashMap<>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            if (table.get(second) <= table.get(first)) sum = sum + table.get(first);
            else sum = sum - table.get(first);
        }
        sum = sum + table.get(s.charAt(s.length() - 1));
        return sum;
    }


    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int index = 0;
        String firstElement = strs[0];
        int lenght = firstElement.length() - 1;
        while (lenght >= 0) {
            for (int i = 1; i < strs.length; i++) {
                String element = strs[i];
                if (index <= element.length() - 1) {
                    if (firstElement.charAt(index) == element.charAt(index)) ;
                    else return result;
                } else return result;
            }
            result = result + firstElement.charAt(index);
            index = index + 1;
            lenght = lenght - 1;
        }
        return result;
    }

//    public boolean isValid(String s) {
//        Map<Character, Integer> brackets = new HashMap<>();
//        brackets.put('(', 0);
//        brackets.put(')', 0);
//        brackets.put('[', 0);
//        brackets.put(']', 0);
//        brackets.put('{', 0);
//        brackets.put('}', 0);
//        for (int i = 0; i < s.length(); i++) {
//            char first = s.charAt(i);
//            if (brackets.containsKey(first)) brackets.put(first, brackets.get(first) + 1);
//            else brackets.put(first, 1);
//        }
//        if ((brackets.get('(') + brackets.get(')')) % 2 == 1) return false;
//        if ((brackets.get('[') + brackets.get(']')) % 2 == 1) return false;
//        if ((brackets.get('{') + brackets.get('}')) % 2 == 1) return false;
//        return true;
//    }

    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (element == ')' || element == '}' || element == ']') {
                if (stack.size() > 0) {
                    int last = stack.size() - 1;
                    if (element == ')' && stack.get(last) == '(') stack.remove(last);
                    else if (element == '}' && stack.get(last) == '{') stack.remove(last);
                    else if (element == ']' && stack.get(last) == '[') stack.remove(last);
                    else return false;
                } else return false;
            } else stack.add(element);
        }
        if (stack.size() == 0) return true;
        return false;
    }


    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count = count + 1;
                if (i == 0 || s.charAt(i - 1) == ' ') break;
            }
        }
        return count;
    }

    public int removeDuplicates(int[] nums) {
        int elements = 1;
        int fixed = nums[0];
        int index = 1;
        for (int num : nums) {
            if (fixed != num) {
                elements = elements + 1;
                fixed = num;
                nums[index] = fixed;
                index = index + 1;
            }
        }
        return elements;
    }

    public int searchInsert(int[] nums, int target) {
        int midTerm = (int) nums.length / 2;
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] == target) return left;
        else if (nums[right] == target) return right;
        while (left < right) {
            if (nums[midTerm] == target) {
                return midTerm;
            } else if (left == (right - 1)) {
                break;
            } else if (nums[midTerm] < target) {
                left = midTerm;
                midTerm = midTerm + (int) (right - left) / 2;
            } else if (nums[midTerm] > target) {
                right = midTerm;
                midTerm = midTerm - (int) (right - left) / 2;
            }
        }
        if (nums[left] < target && nums[right] > target) return right;
        else if (nums[right] < target) return right + 1;
        else if (nums[left] > target) return left;
        return midTerm;
    }


    public int strStr(String haystack, String needle) {
        int index = -1;
        if (haystack.length() < needle.length()) return index;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                index = i;
                int count = 1;
                for (int j = 1; j < needle.length(); j++) {
                    if (i + j > haystack.length() - 1) return -1;
                    else if (haystack.charAt(i + j) != needle.charAt(j)) index = -1;
                    else count += 1;
                }
                if (count == needle.length()) return index;
            }
        }
        return index;
    }


//    public int[] plusOne(int[] digits) {
//        List<Integer> sum = new ArrayList<>();
//        for (int index = digits.length-1; index >= 0 ; index--) sum.add(0, digits[index]);
//        for (int index = digits.length-1; index >= 0 ; index--) {
//            if (sum.get(index) != 9) {
//                sum.set(index, sum.get(index)+1);
//                break;
//            }
//            else sum.set(index, 0);
//        }
//        if (sum.get(0) == 0) sum.add(0, 1);
//        return sum.stream().mapToInt(i -> i).toArray();
//    }


    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            int[] resultWithCarry = new int[digits.length + 1];
            for (int i = 1; i < resultWithCarry.length; i++) {
                resultWithCarry[i] = digits[i - 1];
            }
            resultWithCarry[0] = carry;
            return resultWithCarry;
        }
        return digits;
    }

    public String addBinary(String a, String b) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('0', 0);
        values.put('1', 1);
        int length = b.length() - 1;
        int carry = 0;
        int sum;
        String answer = "";
        for (int i = a.length() - 1; i > -1; i--) {
            if (length > -1) {
                sum = values.get(a.charAt(i)) + values.get(b.charAt(length)) + carry;
                length = length - 1;
            } else {
                sum = values.get(a.charAt(i)) + carry;
            }
            if (sum == 0) {
                answer = "0" + answer;
                carry = 0;
            } else if (sum == 1) {
                answer = "1" + answer;
                carry = 0;
            } else if (sum == 2) {
                answer = "0" + answer;
                carry = 1;
            } else if (sum == 3) {
                answer = "1" + answer;
                carry = 1;
            }
        }
        if (carry == 1) {
            answer = "1" + answer;
        }
        return answer;
    }

    public int intSqrt(int x) {
        for (int i = 1; i <= x+1/2; i++) {
            if (i * i == x) {
                return i;
            } else if (i * i > x) {
                return i - 1;
            }
        }
        return x;
    }

    public int climbStairs(int n){
        int previous = 0;
        int current = 1;
        if (n == 1) {
            return current;
        }
        for (int i = 0; i < n; i++) {
            current = current + previous;
            previous = current - previous;
        }
        return current;
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        int elements = 0;
        for (int num : nums) {
            if (num != val) {
                nums[index] = num;
                index = index + 1;
                elements = elements + 1;
            }
        }
        return elements;
    }

    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            int count = 0;
            for (int u = start; u < s.length(); u++) {
                char letter = s.charAt(u);
                if (!set.contains(letter)) {
                    count = count + 1;
                    set.add(letter);
                }
                else {
                    break;
                }
            }
            start = start + 1;
            if (longest < count) {
                longest = count;
            }
        }
        return longest;
    }


//    public String intToRoman(int num) {
//        String answer = "";
//        int result = 0;
//        int index = 2;
//        int[] values = {1000, 500, 100, 50, 10, 5, 1, 0, 0};
//        HashMap<Integer, String> table = new HashMap<>();
//        table.put(1, "I");
//        table.put(5, "V");
//        table.put(10, "X");
//        table.put(50, "L");
//        table.put(100, "C");
//        table.put(500, "D");
//        table.put(1000, "M");
//        while (num > 0) {
//            result = num / values[index-2];
//            if (result != 0) {
//                answer = answer + (table.get(values[index-2]).repeat(result));
//                num = num - (values[index-2] * result);
//            }
//            else {
//                if ((num + values[index]) / values[index - 2] == 1 ) {
//                    answer = answer + table.get(values[index]) + table.get(values[index - 2]);
//                    num = (num + values[index]) - values[index - 2];
//                }
//                else if ((num + values[index]) / values[index - 1] == 1) {
//                    answer = answer + table.get(values[index]) + table.get(values[index - 1]);
//                    num = (num + values[index]) - values[index - 1];
//                }
//                else {
//                    index = index + 1;
//                }
//            }
//        }
//        return answer;
//    }




//    public String intToRoman(int num) {
//        int[] value = new int[6];
//        int[] values = {1000, 500, 100, 50, 10, 5, 1};
//        int i = 0;
//        for (int j = 0; j < values.length; j++) {
//            if ((num / values[j]) * values[j] != 0) {
//                value[i] = (num / values[j]) * values[j];
//                num = num - value[i];
//                i = i + 1;
//            }
//        }
//        HashMap<Integer, String> table = new HashMap<>();
//        table.put(1, "I");
//        table.put(5, "V");
//        table.put(10, "X");
//        table.put(50, "L");
//        table.put(100, "C");
//        table.put(500, "D");
//        table.put(1000, "M");
//        table.put(4, "IV");
//        table.put(9, "IX");
//        table.put(40, "XL");
//        table.put(90, "XC");
//        table.put(400, "CD");
//        table.put(900, "CM");
//        String answer = "";
//        int valueIndex = 0;
//        int result = 0;
//        for (int k : values) {
//            result = value[valueIndex] / k;
//            if (table.containsKey(value[valueIndex])){
//                answer = answer + table.get(value[valueIndex]);
//                valueIndex = valueIndex + 1;
//            }
//            else if (result == 1 || result == 2 || result == 3) {
//                answer = answer + (table.get(k).repeat(result));
//                valueIndex = valueIndex + 1;
//            }
//            else if (value[valueIndex] == 0) {
//                return answer;
//            }
//        }
//        return answer;
//    }



//    public String intToRoman(int num) {
//        List<Integer> bucket = new ArrayList<>();
//        int[] values = {1000, 500, 100, 50, 10, 5, 1};
//        int j = 0;
//        int k = 2;
//        while (num > 0) {
//            if (num < values[k]){
//                k = k + 2;
//                j = k - 2;
//            }
//            else if ((num / values[j]) != 0) {
//                for (int i = 0; i < (num / values[j]); i++) {
//                    bucket.add(0, (values[j]));
//                }
//                num = num - ((num / values[j]) * values[j]);
//            }
//
//            else if (num / ((values[k]) * 9) == 1){
//                bucket.add(0, values[k]);
//                bucket.add(0, values[k-2]);
//                num = num - (values[k-2] - values[k]);
//            }
//            else if ((num / values[j+1]) != 0) {
//                for (int i = 0; i < (num / values[j+1]); i++) {
//                    bucket.add(0, (values[j+1]));
//                }
//                num = num - ((num / values[j+1]) * values[j+1]);
//            }
//            else if (num / ((values[k]) * 4) == 1) {
//                bucket.add(0, values[k]);
//                bucket.add(0, values[k-1]);
//                num = num - (values[k-1] - values[k]);
//            }
//            else {
//                j++;
//            }
//        }
//        HashMap<Integer, String> table = new HashMap<>();
//        table.put(1, "I");
//        table.put(5, "V");
//        table.put(10, "X");
//        table.put(50, "L");
//        table.put(100, "C");
//        table.put(500, "D");
//        table.put(1000, "M");
//        String answer = "";
//        for (Integer integer : bucket) {
//                answer = table.get(integer) + answer;
//        }
//        return answer;
//    }
public String intToRoman(int num) {
    HashMap<Integer, String> table = new HashMap<>();
    table.put(1, "I");
    table.put(5, "V");
    table.put(10, "X");
    table.put(50, "L");
    table.put(100, "C");
    table.put(500, "D");
    table.put(1000, "M");
    String answer = "";
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
                answer = answer + table.get((values[j]));
            }
            num = num - ((num / values[j]) * values[j]);
        }

        else if (num / ((values[k]) * 9) == 1){
            answer = answer + table.get((values[k]));
            answer = answer + table.get((values[k - 2]));
            num = num - (values[k-2] - values[k]);
        }
        else if ((num / values[j+1]) != 0) {
            for (int i = 0; i < (num / values[j+1]); i++) {
                answer = answer + table.get((values[j + 1]));
            }
            num = num - ((num / values[j+1]) * values[j+1]);
        }
        else if (num / ((values[k]) * 4) == 1) {
            answer = answer + table.get((values[k]));
            answer = answer + table.get((values[k - 1]));
            num = num - (values[k-1] - values[k]);
        }
        else {
            j = j + 1;
        }
    }
    return answer;
}

    public boolean isHappy(int n) {
        int temp = 0;
        int sum = 0;
        while (n > 0) {
            while (n > 0) {
                temp = n % 10;
                sum = sum + (temp * temp);
                n = n / 10;
            }
            if ( sum >= 0 && sum <= 9 && sum != 1) {
                return false;
            }
            else if (sum == 1) {
                return true;
            }
            n = sum;
            sum = 0;
        }
        return false;
    }

}

