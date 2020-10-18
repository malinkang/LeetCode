# 226. 翻转二叉树

## 题目描述

[原题](https://leetcode-cn.com/problems/invert-binary-tree/)

翻转一棵二叉树。

**示例：**

输入：

```text
     4
   /   \
  2     7
 / \   / \
1   3 6   9
```

输出：

```text
     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

**备注:**

这个问题是受到 [Max Howell ](https://twitter.com/mxcl)的 [原问题](https://twitter.com/mxcl/status/608682016205344768) 启发的 ：

> 谷歌：我们90％的工程师使用您编写的软件\(Homebrew\)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。

## 题解

```java
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
```

