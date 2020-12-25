package LinkedList;

import Structure.LinkedList;
import Structure.LinkedList.*;
import org.junit.jupiter.api.*;

import static LinkedList.MergeTwoSortedLists.sortedMerge;

class MergeTwoSortedListTest {

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("Test begins");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("Test ends");
    }

    /**
     * Test of merge 2 sorted lists
     */
    @Test
    void testSortedMerge() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        // target merged list
        LinkedList mergedList = new LinkedList();

        // l1: -1->0->1
        l1.addToTail(new ListNode(-1));
        l1.addToTail(new ListNode(0));
        l1.addToTail(new ListNode(1));
        // l2: -2->4->7
        l2.addToTail(new ListNode(-2));
        l2.addToTail(new ListNode(4));
        l2.addToTail(new ListNode(7));

        mergedList.head = sortedMerge(l1.head,l2.head);
        // Assert number of nodes in merged list are 6
        Assertions.assertEquals(6, mergedList.countList());
    }

    @Test
    void testSortedMergeAllEmpty() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        mergedList.head = sortedMerge(l1.head,l2.head);
        Assertions.assertEquals(0, mergedList.countList());
    }

    @Test
    void testSortedMergeOneEmpty() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        l1.addToTail(new ListNode(-1));
        l1.addToTail(new ListNode(9));

        mergedList.head = sortedMerge(l1.head, l2.head);
        Assertions.assertEquals(2, mergedList.countList());

    }
}