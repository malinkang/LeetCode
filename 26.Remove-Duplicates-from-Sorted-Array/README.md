### [26.Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

这道题首先想到的就是借助Set去重。

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int len = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
                len++;
                if (len - 1 != i) {
                    nums[len - 1] = nums[i];
                }

            }
        }
        return len;
    }
}
```

官方给的解法思路看成两个数组，i为新数组的索引，j为原来数组的索引。

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
```