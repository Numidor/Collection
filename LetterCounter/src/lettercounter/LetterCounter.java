/*
* Finds the largest word in the specified file
*/
package lettercounter;

import java.util.*;
import java.io.*;

public class LetterCounter {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the file path: ");
            String inputPath = in.nextLine();
            BufferedReader fin = new BufferedReader(new FileReader(inputPath));

            int maxCount = 0;
            String word = null;

            for (;;) {
                String line = fin.readLine();
                if (line == null) {
                    break;
                }
                line = line.toLowerCase();
                String cleanedLine = line.replaceAll("[\\W]", " ");
                String[] sentenceWords = cleanedLine.split("\\s+");
                HashSet set = new HashSet();
                int numWords = sentenceWords.length;
                for (int i = 0; i < numWords; i++) {
                    if (!set.contains(sentenceWords[i])) {
                        set.add(sentenceWords[i]);
                        int newCount = count(sentenceWords[i]);
                        if (newCount > maxCount) {
                            word = sentenceWords[i];
                            maxCount = newCount;
                        }
                    }
                }
            }
            fin.close();
            System.out.println(word);

        } catch (IOException ex) {
        }
    }

    public static Integer count(String word) {
        int maxCount = 0;
        while (word.length() > 0) {
            String newWord = word.replace(word.substring(0, 1), "");
            int count = word.length() - newWord.length();
            if (count > maxCount) {
                maxCount = count;
            }
            word = newWord;
        }
        return maxCount;
    }
}
