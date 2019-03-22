### [219.Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/)

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //key是数字 value是索引
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            Integer index = map.get(nums[i]);
            if(index != null && k >= (i - index)){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
```