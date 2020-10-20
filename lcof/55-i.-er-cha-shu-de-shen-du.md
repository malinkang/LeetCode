# 55 - I. 二叉树的深度

## 题目描述

[原题](https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/)

输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。

例如：

给定二叉树 `[3,9,20,null,null,15,7]`，

```text
   3
   / \
  9  20
    /  \
   15   7
```

返回它的最大深度 3 。

**提示：**

1. `节点总数 <= 10000`

注意：本题与主站 104 题相同：[https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)

## 题解

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
```

