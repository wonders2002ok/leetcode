package LinkedList;

import Structure.LinkedList.*;

/**
 * @author Wallace
 */
public class ReverseLinkedList {
    /**
     * Reverse linked list
     * @param head linked list
     * @return return linked list
     */
    public static ListNode reverse(ListNode head) {
        //Deal with empty list
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummyHead = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = dummyHead;
            dummyHead = cur;
            cur = temp;
        }
        return dummyHead;
    }
}
