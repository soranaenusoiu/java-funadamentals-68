package com.sda.codingFundamentals;

// 345. Reverse Vowels of a String from Leetcode

public class Task22 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcoda"));
    }
    public static String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int vowel1 = findNextVowelForward(charArray,0);
        int vowel2 = findNextVowelBackwards(charArray,charArray.length -1);
        while (vowel1 < vowel2) {
            char temp = charArray[vowel1];
            charArray[vowel1] = charArray[vowel2];
            charArray[vowel2] = temp;
            vowel1 = findNextVowelForward(charArray, vowel1 + 1);
            vowel2 = findNextVowelBackwards(charArray, vowel2 - 1);
        }
        return new String(charArray);
    }
    public static boolean isVowel(char s) {
        char[] vocals = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < vocals.length; i++) {
            if (vocals[i] == s){
                return true;
            }
        }
        return false;
    }

    public static int findNextVowelForward(char[] s, int startIndex) {
        for (int i = startIndex; i < s.length; i++) {
            if (isVowel(s[i])) {
                return i;
            }
        }
        return s.length;
    }

    public static int findNextVowelBackwards(char[] s, int startIndex) {
        for (int i = startIndex; i >= 0; i--) {
            if (isVowel(s[i])) {
                return i;
            }
        }
        return -1;
    }
}
