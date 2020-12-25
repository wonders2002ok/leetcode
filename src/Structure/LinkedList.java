package Structure;
/**
 * @author Wallace
 * Basic Struct for Linked List
 */
public class LinkedList {
    /**
     * Head node of the list
     */
    public ListNode head;

    /**
     * Node of linked list
     */
    public static class ListNode {
        public int data;
        public ListNode next;
        public ListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    /**
     * Add new node to the head
     * @param listNode new node
     */
    public void addToHead(ListNode listNode) {
        if(head == null) {
            head = listNode;
            return;
        }
        //add new node to the head
        listNode.next = head;
        head = listNode;
    }

    /**
     * Add new node to the tail of current linked list
     * @param listNode new node
     **/
    public void addToTail(ListNode listNode) {
        if (head == null) {
            head = listNode;
            return;
        }
        // find the tail node
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        // add new node to the tail
        tail.next = listNode;
    }

    /**
     * Print current linked list
     */
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
