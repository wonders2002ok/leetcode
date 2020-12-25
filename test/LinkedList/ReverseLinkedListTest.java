package LinkedList;

import Structure.LinkedList;
import Structure.LinkedList.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static LinkedList.ReverseLinkedList.reverse;

class ReverseLinkedListTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test begins");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ends");
    }

    @Test
    void testReverse() {
        LinkedList l1 = new LinkedList();
        //l1: -5->6->7
        l1.addToTail(new ListNode(-5));
        l1.addToTail(new ListNode(6));
        l1.addToTail(new ListNode(7));
        l1.addToTail(new ListNode(-3));

        LinkedList reversed = new LinkedList();
        reversed.head = reverse(l1.head);
        reversed.printList();

    }

    @Test
    void testReverseEmpty() {
        LinkedList l1 = new LinkedList();

        LinkedList reversed = new LinkedList();
        reversed.head = reverse(l1.head);
        reversed.printList();
    }
}