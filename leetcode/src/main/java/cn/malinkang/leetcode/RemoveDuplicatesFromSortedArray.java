package cn.malinkang.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (set.add(nums[i])) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        System.out.println("result =="+removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println("result =="+removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1,1,2}));
    }
}
