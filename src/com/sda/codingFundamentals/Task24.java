package com.sda.codingFundamentals;

// 58. Length of Last Word fromLeetcode

public class Task24 {

    public static void main(String[] args) {
        String s = "Hello world";
        String s2 = " fly to the moon ";
        String s3 = " luffy is still joyboy";
        String s4 = "    ";
        String s5 = "test";
        lenghtOfTheLastWordOfTheLastWord(s2);

        System.out.println(lenghtOfTheLastWordOfTheLastWord(s));
        System.out.println(lenghtOfTheLastWordOfTheLastWord(s2));
        System.out.println(lenghtOfTheLastWordOfTheLastWord(s3));
        System.out.println(lenghtOfTheLastWordOfTheLastWord(s4));
        System.out.println(lenghtOfTheLastWordOfTheLastWord(s5));
    }

    private static int lenghtOfTheLastWordOfTheLastWord(String s) {

        s = s.trim();
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.substring(i+1).length();
            }
        }
        return s.length();
    }
}
