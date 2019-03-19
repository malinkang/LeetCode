因为输入的数组是有序的可以通过二分查找来查找目标数

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0;i< numbers.length - 1; i++){
            int targetIndex = binarySearch(numbers,i + 1,target - numbers[i]);
            if( targetIndex > 0){
                return new int[]{i + 1,targetIndex + 1};
            }
        }
        return null;
    }
    private int binarySearch(int[] nums,int fromIndex,int key) {
        int low = fromIndex, high = nums.length - 1;
        while(low <= high){
            int middle = (low + high) >>> 1;
            if(nums[middle] > key)
                high = middle - 1;
            else if(nums[middle] < key)
                low = middle + 1;
            else
                return middle;
        }
        return -(low + 1);
    }
}
```