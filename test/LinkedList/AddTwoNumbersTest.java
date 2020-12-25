package LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Structure.LinkedList;
import Structure.LinkedList.*;

import static LinkedList.AddTwoNumbers.addTwoNumbers;

class AddTwoNumbersTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test begins");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ends");
    }

    @Test
    void testAddTwoNumbers() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList result = new LinkedList();

        //l1: 2->4->3
        l1.addToTail(new ListNode(2));
        l1.addToTail(new ListNode(4));
        l1.addToTail(new ListNode(3));
        //l2: 5->6->4
        l2.addToTail(new ListNode(5));
        l2.addToTail(new ListNode(6));
        l2.addToTail(new ListNode(4));

        result.head = addTwoNumbers(l1.head, l2.head);
        result.printList();
        //to-do: to be implemented
    }

    @Test
    void testAddTwoNumbersWithOneEmpty() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList result = new LinkedList();

        //l1: 2->4->3
        l1.addToTail(new ListNode(2));
        l1.addToTail(new ListNode(4));
        l1.addToTail(new ListNode(9));
        //l2: empty
        result.head = addTwoNumbers(l1.head, l2.head);
        result.printList();
        //to-do: to be implemented
    }

    @Test
    void testAddTwoNumberAllEmpty() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList result = new LinkedList();

        //l1: empty
        //l2: empty
        result.head = addTwoNumbers(l1.head, l2.head);
        result.printList();
        //to-do: to be implemented
    }
}