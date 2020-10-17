package cn.malinkang.leetcode;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int count = 0;
        for (int i = 0; i < heights.length ; i++) {
            int min = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] < heights[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = heights[min];
                heights[min] = heights[i];
                heights[i] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(heights));
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,1,4,2,1,3};
        HeightChecker heightChecker = new HeightChecker();
        System.out.println(heightChecker.heightChecker(array));
    }
}
