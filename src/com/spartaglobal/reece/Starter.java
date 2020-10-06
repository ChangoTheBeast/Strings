package com.spartaglobal.reece;

public class Starter {
    public void start() {
        Printer p = new Printer();
        String s = "aba";
        String test = "notPalindrome";
        String test2 = "deified";

        Palindrome palindrome = new Palindrome();
        boolean b = palindrome.isPalindrome(s);
        boolean bTest = palindrome.isPalindrome(test);
        boolean bTest2 = palindrome.isPalindrome(test2);
        p.printPal(s, b);
        p.printPal(test, bTest);
        p.printPal(test2, bTest2);
        System.out.println("");
        String testSentence = "The quick brown fox jumped over the lazy dog.";
        String testSentence2 = "This sentence contains at least one palindrome like deified.";
        String testSentence3 = "This sentence must have multiple palindromes like deified, redivider, radar, reviver.";
        String testSentence4 = "Deified man with a mollusk shaped radar was known as the 'Reviver of Adam'.";

        p.printLongestPal(palindrome.longestPalindrome(testSentence), testSentence);
        p.printLongestPal(palindrome.longestPalindrome(testSentence2), testSentence2);
        p.printLongestPal(palindrome.longestPalindrome(testSentence3), testSentence3);
        p.printLongestPal(palindrome.longestPalindrome(testSentence4), testSentence4);

    }
}
