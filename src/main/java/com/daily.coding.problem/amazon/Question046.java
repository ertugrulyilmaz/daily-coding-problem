package com.daily.coding.problem.amazon;

/**
 * This problem was asked by Amazon.
 * <p>
 * Given a string, find the longest palindromic contiguous substring. If there are more than one with the maximum length, return any one.
 * <p>
 * For example, the longest palindromic substring of "aabcdcb" is "bcdcb". The longest palindromic substring of "bananas" is "anana".
 */
public class Question046 {

  public static void main(String[] args) {
    Question046 q = new Question046();
    String str = "aabcdcb";
    String substring = q.longestPalindromicSubstring(str);

    System.out.println(substring);
  }

  private String longestPalindromicSubstring(String str) {
    return null;
  }

}
