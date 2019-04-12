### [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)

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
    //声明3个node，prev是前一个 curr 是当前 next是下一个
    //先获取后一个然后让当前指向前一个 然后改变prev和curr的值
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(current!=null){
            ListNode next = curr.next;//获取后一个
            curr.next = prev;//当前指向前一个
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
```