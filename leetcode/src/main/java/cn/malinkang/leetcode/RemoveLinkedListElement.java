package cn.malinkang.leetcode;

public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode curr = head;
        ListNode prev = dummyHead;//前一个结点
        while (curr != null) {
            if (curr.val != val) {
                prev = curr;
            } else {
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
