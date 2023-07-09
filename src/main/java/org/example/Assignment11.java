package org.example;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Assignment11 {
    public static void main(String[] args) {
        String filePath = "/Users/ayushkumar/test.txt";
        String outPath = "/Users/ayushkumar/test_out.txt";
        String text = "";
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                text = text + line;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        Map<Character, Integer> map = countCharacter(text);
        String outPut = "";
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
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
}
