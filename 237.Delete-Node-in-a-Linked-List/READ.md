### [237.Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)

这道题最简答的方式获取给定Node的前一个Node，改变其next的值即可。但是无法获取前一个Node，所以只能把给定的Node的值改为跟它下一个Node的值一样，并跳过下一个Node。

![](237_LinkedList.png)


![](237_LinkedList2.png)

![](237_LinkedList3.png)

![](237_LinkedList4.png)

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
```