package com.sda.codingFundamentals;

// 125. Valid Palindrome from Leetcode

public class Task21 {
    public static void main(String[] args) {

        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        String resultS = s.toLowerCase().replaceAll("[-+.^:, ]", "");
        for (int i = 0; i < resultS.length() / 2; i++) {
            char character1 = resultS.charAt(i);
            char character2 = resultS.charAt(resultS.length() - 1 - i);
            if (character1 != character2) {
                return false;
            }
        }
        System.out.println(resultS);
        return true;
    }
}
