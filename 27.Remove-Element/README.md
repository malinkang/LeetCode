### [27.Remove Element](https://leetcode.com/problems/remove-element/)

和26题思路一样，当做两个数组来处理。

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i ;
    }
}
```