### [67.Add Binary](https://leetcode.com/problems/add-binary/)

这道题和第二题基本类似，一一对应求和，大于2的进位。

```java
class Solution {
    public String addBinary(String a, String b) {        
        int i = a.length() -1 , j = b.length() -1;
        int carry = 0;
        StringBuffer sb = new StringBuffer();
        while(i>-1 || j >-1){
            int x = (i>-1) ? (a.charAt(i)=='0'?0:1) : 0;
            int y = (j>-1) ? (b.charAt(j)=='0'?0:1) : 0;
            int sum = x + y + carry;
            carry = sum/2;
            sb.append(sum%2);
            if(i>-1)i--;
            if(j>-1)j--;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
```