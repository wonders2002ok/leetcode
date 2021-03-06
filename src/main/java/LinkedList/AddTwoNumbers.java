package LinkedList;

import Structure.LinkedList.*;

/**
 * @author wanghaiming
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // head node
        ListNode pre = new ListNode(-1);
        // linked list for calculation
        ListNode cur = pre;
        // 进位符
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 == null) ? 0 : l1.data;
            int y = (l2 == null) ? 0 : l2.data;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        // 进位就加一
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}