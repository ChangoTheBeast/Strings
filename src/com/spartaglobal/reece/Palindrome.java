package com.spartaglobal.reece;

public class Palindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z]", "");
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        char[] reversedArray = chars;
        for (int i = 0; i < chars.length; i++) {
            reversedArray[chars.length-1-i] = chars[i];
        }
        String reversed = new String(reversedArray); //Cannot use reversedArray.toString(), that gives the string of the object reference.
        if (reversed.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public String longestPalindrome(String sentence) {
        String[] words= sentence.split(" ");
        String longestPal = "";
        for (String s : words) {
            if (longestPal.length() < s.length() && s.length() > 2) {
                if (this.isPalindrome(s)) {
                    longestPal = s;
                }
            }
        }
        if (longestPal.length() == 0) {
            return null;
        } else {
            return longestPal;
        }
    }
}
