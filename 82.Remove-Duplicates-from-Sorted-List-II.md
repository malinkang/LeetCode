### [82. Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)

先获取重复的val，存放到Set中，然后再遍历，如果是是重复的数据则跳过。

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
    Set<Integer> set = new HashSet<>();

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        //避免递归重复调用
        if(set.isEmpty()){
            ListNode next = head.next;
            int val = head.val;
            while(next != null){
                if(val == next.val){
                    set.add(val);
                }
                val = next.val;
                next = next.next;
            }
        }
        //如果集合为空说明不存在重复的元素直接返回
        if(set.isEmpty()){
            return head;
        }
        while (head != null && set.contains(head.val)) {
            head = head.next;
        }
        if(head != null)
            head.next = deleteDuplicates(head.next);
        return head; 
    }
}
```