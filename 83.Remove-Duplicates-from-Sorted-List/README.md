### [83.Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

对于重复的只取最后一个ListNode即可，通过递归依次去重

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        int val = head.val;
        while(head.next!=null && val == head.next.val){
            head = head.next;
        }
        head.next=deleteDuplicates(head.next);
        return head; 
    }
}
```