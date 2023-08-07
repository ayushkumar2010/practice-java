package org.example;

import java.util.HashSet;
import java.util.Set;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println(checkAlphabet("qwertyABui0oplkjhgf94@!$%^GFSAAdszxcvbnma"));

    }

    /**
     *  Write a java function that checks if the input string contains all the letters
     *  of the alphabet a-z (case-insensitive). Write time and space complexity of your
     *  solution as comments in the source file.
     */
    public static boolean checkAlphabet(String input) {
        Set<Character> set = new HashSet<>();
        for(Character c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
                if (set.size() == 26) {
                    return true;
                }
            }
        }
        return false;
    }
}

