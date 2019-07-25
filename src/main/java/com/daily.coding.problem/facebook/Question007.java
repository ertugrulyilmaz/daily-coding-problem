package com.daily.coding.problem.facebook;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * This problem was asked by Facebook.
 * <p>
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
 * <p>
 * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 * <p>
 * You can assume that the messages are decodable. For example, '001' is not allowed.
 */
@Slf4j
public class Question007 {

  private static final char[] alphabets = new char[27];

  public static void main(String[] args) {
    for (int i = 0; i < 26; i++) {
      alphabets[i + 1] = (char) ('A' + i);
    }

    Question007 q = new Question007();
    q.numDecodings2("1224");
  }

  private int numDecodings(String s) {
    if (s.length() == 0) return 0;

    int[] dp = new int[s.length() + 1];
    dp[0] = 1;
    dp[1] = s.charAt(0) == '0' ? 0 : 1;

    for (int i = 2; i <= s.length(); i++) {
      if ('0' != s.charAt(i - 1)) {
        dp[i] = dp[i - 1];
      }

      int twoDigits = Integer.parseInt(s.substring(i - 2, i));
      if (twoDigits >= 10 && twoDigits <= 26) {
        dp[i] += dp[i - 2];
      }
    }

    return dp[s.length()];
  }

  private void numDecodings2(String s) {
    int length = s.length();

    if (length == 0) return;
    if (length == 1) {
      int number = Integer.parseInt(s);
      System.out.println(alphabets[number]);
      return;
    }

    if (length == 2) {
      int number = Integer.parseInt(s);
      System.out.print(alphabets[s.charAt(0) - '0']);
      System.out.print(alphabets[s.charAt(1) - '0']);
      System.out.print(",");

      if (number >= 10 && number <= 26) {
        System.out.println(alphabets[number]);
      }

      return;
    }

    for (int i = 0; i < length; i++) {
      numDecodings2(s.substring(i, i + 1));
      numDecodings2(s.substring(i + 1));
    }
  }

}
