/*
* returns input line with every word in reverse order, and every letter in every word reversed
*/
package stringlinereversal;

import java.util.Arrays;
import java.util.Scanner;

public class StringLineReversal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string line: ");
        String input = in.nextLine();

        String cleanedInput = input.replaceAll("[\\W]", " ");
        String[] sentenceWords = cleanedInput.split("\\s+");
        int numWords = sentenceWords.length;
        String[] reverseWords = new String[numWords];
        for (int i = 0; i < numWords; i++) {
            String tmp = sentenceWords[i];
            int length = tmp.length();
            StringBuilder str = new StringBuilder("");
            for (int k = length - 1; k >= 0; k--) {
                str = str.append(tmp.charAt(k));
            }
            reverseWords[numWords - i - 1] = str.toString();
        }
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < numWords; i++) {
            output = output.append(reverseWords[i] + " ");
        }
        System.out.println(output);
    }

}
