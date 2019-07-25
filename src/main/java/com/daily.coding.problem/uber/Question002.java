package com.daily.coding.problem.uber;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * This problem was asked by Uber.
 * <p>
 * Given an array of integers, return a new array such that each element at index i of the new array is
 * the product of all the numbers in the original array except the one at i.
 * <p>
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * <p>
 * Follow-up: what if you can't use division?
 */
@Slf4j
public class Question002 {

  private static int[] productOfAllNumbersInOriginalArrayExceptOneAtI(int[] nums) {
    if (nums == null || nums.length == 0) return null;

    int n = nums.length;
    int[] product = new int[n];
    int temp = 1;

    Arrays.fill(product, 1);

    for (int i = 0; i < n; i++) {
      product[i] = temp;
      temp *= nums[i];
    }

    temp = 1;

    for (int i = n - 1; i >= 0; i--) {
      product[i] *= temp;
      temp *= nums[i];
    }

    return product;
  }

  public static void main(String[] args) {
    log.info("{}", productOfAllNumbersInOriginalArrayExceptOneAtI(new int[]{1, 2, 3, 4, 5}));
    log.info("{}", productOfAllNumbersInOriginalArrayExceptOneAtI(new int[]{1, 0, 3, 4, 5}));
    log.info("{}", productOfAllNumbersInOriginalArrayExceptOneAtI(new int[]{1, 0, 0, 4, 5}));
  }

}
