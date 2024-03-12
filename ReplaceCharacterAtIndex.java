import java.util.*;

import java.util.Scanner;

public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String originalString = inputScanner.nextLine();

        System.out.print("Enter the index to replace (0 to " + (originalString.length() - 1) + "): ");
        int replaceIndex = inputScanner.nextInt();

        if (replaceIndex < 0 || replaceIndex >= originalString.length()) {
            System.out.println("Invalid index!");
            return;
        }

        System.out.print("Enter the new character: ");
        char newChar = inputScanner.next().charAt(0);

        String modifiedString = replaceCharacterAtIndex(originalString, replaceIndex, newChar);

        // Printing the results
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        inputScanner.close();
    }

    public static String replaceCharacterAtIndex(String inputStr, int targetIndex, char replacementChar) {
        if (inputStr == null || targetIndex < 0 || targetIndex >= inputStr.length()) {
            return inputStr;
        }

        char[] charArray = inputStr.toCharArray();
        charArray[targetIndex] = replacementChar;

        return new String(charArray);
    }
}
