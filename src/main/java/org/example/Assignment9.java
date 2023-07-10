package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        checkExpression("Do you know.");
    }

    /**
     * Using the documentation for java util. regex Pattern as a resource, write and test a regular expression that
     * checks a sentence to see that it begins with a capital letter and ends with a period.
     */
    public static void checkExpression(String input) {
        String regex = "^[A-Z].*\\.$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("match found for Regex." + matcher.group());
        } else {
            System.out.println("No match found for Regex.");
        }
    }
}
