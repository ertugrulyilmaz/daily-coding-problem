package com.daily.coding.problem.google;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 *
 * This problem was recently asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers from the list enque up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 *
 * */
@Slf4j
public class Question001 {

  private static int[] findPairs(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      map.put(k - nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int p1 = nums[i];
      if (map.containsKey(p1) && i != map.get(p1)) {
        int p2 = k - nums[i];
        return new int[]{Math.min(p1, p2), Math.max(p1, p2)};
      }
    }

    return null;
  }

  public static void main(String[] args) {
    int[] pairs1 = findPairs(new int[]{10, 15, 3, 7}, 17);
    int[] pairs2 = findPairs(new int[]{3, 15, 3, 7}, 6);

    log.info("{} {}", pairs1, pairs1[0] == 7 && pairs1[1] == 10);
    log.info("{} {}", pairs2, pairs2[0] == 3 && pairs2[1] == 3);

  }

}
