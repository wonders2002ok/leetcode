package LinkedList;

import Structure.LinkedList.*;

/**
 * @author Wallace
 */
public class MergeTwoSortedLists {
    /**
     * Merge 2 sorted list
     * @param l1 linked list 1
     * @param l2 linked list 2
     * @return node
     */
    public static ListNode sortedMerge(ListNode l1, ListNode l2) {
        // if all equals null, return null.
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if(l1.data <= l2.data) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        // l1 or l2 has nodes that have greater val than the sorted list, put them to the tail.
        cur.next = (l2 == null) ? l1 : l2;
        return dummyHead.next;
    }
}
