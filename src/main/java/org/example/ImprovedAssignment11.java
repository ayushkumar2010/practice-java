package org.example;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and
 * counts the occurrence of all the different characters. Save the results in a text file.
 */
public class ImprovedAssignment11 {
    public static void main(String[] args) {
        String filePath = "/Users/ayushkumar/test.txt";
        String outPath = "/Users/ayushkumar/test_out.txt";
        String text = "";
        Map<Character, Integer> main = new HashMap<>();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                text = text + line;
                Map<Character, Integer> map = countCharacter(text);
                mergeMap(main, map);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        String outPut = "";
        for (Map.Entry<Character, Integer> e : main.entrySet()) {
            outPut = outPut + e.getKey() + ", " + e.getValue() + "\n";
        }
        writeToFile(outPath, outPut);
    }

    public static Map<Character, Integer> countCharacter(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    public static void writeToFile(String filePath, String text) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void mergeMap(Map<Character, Integer> main , Map<Character, Integer> input) {
        for (Map.Entry<Character, Integer> e : input.entrySet()) {
            if (main.containsKey(e.getKey())) {
                main.put(e.getKey(), e.getValue() + 1);
            }
            else {
                main.put(e.getKey(), e.getValue());
            }
        }
    }
}