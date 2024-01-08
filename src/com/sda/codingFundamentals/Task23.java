package com.sda.codingFundamentals;

// 242. Valid Anagram from Leetcode

import java.util.Arrays;
import java.util.Scanner;
public class Task23 {
    public boolean isAnagram(String s, String t) {
        char charArray[] = s.toCharArray();
        Arrays.sort(charArray);
        char charArray2[] = t.toCharArray();
        Arrays.sort(charArray2);
        if (charArray.length != charArray2.length) {
            return false;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }
}
