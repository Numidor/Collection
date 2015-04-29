/*
* Check if two endeterd strings are permutations of each other
*/
package permutationstring;

import java.util.HashMap;


public class PermutationString {

    public static void main(String[] args) {
        System.out.println(arePermutations("dog", "gad"));
    }
    static boolean arePermutations(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
    }
    HashMap hashMapChars = new HashMap();
    // enter the chars and the number of times each of them appears
    for (int i = 0; i < str1.length(); i++) {
        if (hashMapChars.containsKey(str1.charAt(i))) {
            int count = (int) hashMapChars.get(str1.charAt(i));
            hashMapChars.put(str1.charAt(i), count + 1);
        } else {
            hashMapChars.put(str1.charAt(i), 1);   
        }
    }
    // for each char in str2 decrease the value number
    for (int i = 0; i < str2.length(); i++) {
        if (hashMapChars.containsKey(str2.charAt(i))) {
            int count =(int) hashMapChars.get(str2.charAt(i));
            count--;
            if (count < 0) {
                return false;
            }
            hashMapChars.put(str2.charAt(i), count);
            } else {
                return false;
            }
        }
        return true;
}
    
}
