二分查找

```java
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, hight = nums.length -1;
        while(low <= hight){
            int middle = (hight+low) >>> 1;
            if(nums[middle] < target)
                low = middle + 1;
            else if(nums[middle] > target)
                hight = middle - 1;
            else 
                return middle;
        }
        return -1;
    }
}
```