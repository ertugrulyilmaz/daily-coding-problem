package com.daily.coding.problem.facebook;

/**
 * This problem was asked by Facebook.
 * <p>
 * Given a array of numbers representing the stock prices of a company in chronological order, write a function that
 * calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.
 * <p>
 * For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.
 */
public class Question047 {

  public static void main(String[] args) {
    Question047 q = new Question047();
    int[] arr = new int[]{9, 11, 8, 5, 7, 10};
    int profit = q.findBestProfit(arr);

    System.out.println(profit);
  }

  private int findBestProfit(int[] arr) {
    return 0;
  }

}
