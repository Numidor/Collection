/*
* Checks if the word is an isogram
*/

package stringunique;

import java.util.*;

public class StringUnique {

    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        input = in.nextLine();
        
        int length = input.length();
        int asciiArray[] = new int[256];
        int k = 0;
        for (int i = 0; i < length; i++) {
            int arr = asciiArray[(int)input.charAt(i)];
            if(arr > 0){
                System.out.println("The word has repeating characters.");
                k = 1;
                break;
            }else{
            asciiArray[(int) input.charAt(i)] = ++arr;
            }
        }
        if(k == 0){
            System.out.println("Input word is an isogram.");
        }
    }
}
