### [344. Reverse String](https://leetcode.com/problems/reverse-string/)

```java
class Solution {
    public void reverseString(char[] s) {
        for(int i = 0, j = s.length -1;i < j ; i++ ,j--){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }
    }
}
```