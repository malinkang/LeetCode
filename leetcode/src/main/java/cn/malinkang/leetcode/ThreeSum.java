package cn.malinkang.leetcode;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (map.containsKey(nums[j])) {
                        Integer[] arr = {nums[i], map.get(nums[j]), nums[j]};
                        Arrays.sort(arr);
                        set.add(Arrays.asList(arr));
                    }
                    map.put(-nums[i] - nums[j], nums[j]);
                }

            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum.threeSum(nums))
        ;

    }
}
