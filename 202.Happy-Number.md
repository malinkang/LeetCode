### [202.Happy Number](https://leetcode.com/problems/happy-number/)

```java
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            int sum = 0;
            while(n!=0){
                sum += (n%10)*(n%10);
                n /= 10;
            }
            n = sum;
            if(!set.add(n)){ 
                //当出现重复数字说明进入一个循环直接return false
                return false;
            }
        }
        return true;
    }
}
```