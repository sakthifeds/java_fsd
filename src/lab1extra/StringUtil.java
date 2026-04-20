package lab1extra;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtil {
    public static String performOperation(String input, int choice) {
        switch (choice) {
            case 1:
                return input + input;
            case 2:
                StringBuilder sb = new StringBuilder(input);
                for (int i = 1; i < sb.length(); i += 2) {
                    sb.setCharAt(i, '#');
                }
                return sb.toString();
            case 3:
                Set<Character> seen = new LinkedHashSet<>();
                StringBuilder result = new StringBuilder();
                for (char c : input.toCharArray()) {
                    if (seen.add(c)) {
                        result.append(c);
                    }
                }
                return result.toString();
            case 4:
                char[] arr = input.toCharArray();
                for (int i = 1; i < arr.length; i += 2) {
                    arr[i] = Character.toUpperCase(arr[i]);
                }
                return new String(arr);
            default:
                return input;
        }
    }

    public static boolean isPositiveString(String input) {
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) <= input.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}

