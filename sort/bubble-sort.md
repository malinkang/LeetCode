# 冒泡排序

```java
int[] bubbleSort(int[] nums){
    int len = nums.length;
    //i是趟数，一共需要 len - 1 趟 因为从0开始所以 
    //j是索引每一趟的最大索引是 len - i - 1
    for(int i = 0;i < len - 1 ;i++){
        for(int j = 0;j < len - i - 1;j++){
            //交换
            if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
    }
    return nums;
}
```
