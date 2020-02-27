### [6.ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/)


```java
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        //创建一个List存放每行的字符串
        List<StringBuilder> rows = new ArrayList<>();
        //取两个值最小值
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0; //当前行
        boolean goingDown = false; //是否向下

        for (char c : s.toCharArray()) {
            //获取当前行的StringBuilder并把字符加入
            rows.get(curRow).append(c);
            //当curRow = 0 goingDown = true curRow递增
            //当curRow = numRows - 1 改变方向 goingDown = false curRow递减
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }
        //合并每一行的字符串为一个字符串
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}
```