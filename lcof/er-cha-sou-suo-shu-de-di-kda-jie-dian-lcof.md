# 54. 二叉搜索树的第k大节点

## 题目描述

[原题](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/)

给定一棵二叉搜索树，请找出其中第k大的节点。

**示例 1:**

```text
输入: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
输出: 4
```

**示例 2:**

```text
输入: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
输出: 4
```

**限制：**

1 ≤ k ≤ 二叉搜索树元素个数

## 题解

```java
class Solution {
    public int kthLargest(TreeNode root, int k) {
        //二叉搜索树的中序遍历 是有序的
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        while(!stack.isEmpty()||root!=null){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){
                root = node.right;
            }
        }
        //正序 所以list.size()-k
        return list.get(list.size()-k);
    }
}
```





