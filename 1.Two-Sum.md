### [1.Two Sum](https://leetcode.com/problems/two-sum)

最简单的方法就是遍历两次判断：


```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1;j<nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return null;
    }
}
```
第二种方法是借助Map，一次遍历实现：

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != null)
                return new int[]{map.get(nums[i]),i};
            map.put(target-nums[i],i);
        }
        return null;
    }
}
```