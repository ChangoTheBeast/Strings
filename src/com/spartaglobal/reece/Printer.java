package com.spartaglobal.reece;

public class Printer {
    public void printPal(String s, boolean b) {
        System.out.println("The string '" + s + "' is " + ((b) ?"":"not ") + "a palindrome.");
    }
    public void printLongestPal(String s, String sentence) {
        if (s != null) {
            s = s.replaceAll("[^A-Za-z]", "");
            System.out.println("The longest palindrome in the sentence:\n" + sentence + "\nwas " + s + " which has " + s.length() + " characters.\n");
        } else {
            System.out.println("No palindrome exists in the sentence:\n" + sentence + "\n");
        }
    }
}
