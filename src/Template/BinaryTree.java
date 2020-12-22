package Template;

/**
 * @author Wallace
 */
public class BinaryTree {
    public int count = 0;
    public BinaryTreeNode root;
    /**
     * Node of Binary Tree
     */
    public class BinaryTreeNode {
        public int data;
        public BinaryTreeNode leftChild;
        public BinaryTreeNode rightChild;

        public BinaryTreeNode(int data) {
            this.data = data;
            leftChild = null;
            rightChild = null;
        }
    }

    /**
     * Private recursive function to find if tree nodes contains data
     * @param current
     * @param data
     * @return
     */
    private boolean findRecursive(BinaryTreeNode current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        } else if (data < current.data) {
            findRecursive(current.leftChild, data);
        } else if(data > current.data) {
            findRecursive(current.rightChild,data);
        }
        return false;
    }

    /**
     * Public implementation of find method
     * @param data
     * @return
     */
    public boolean find(int data) {
        return findRecursive(root, data);
    }

    /**
     * Private recursive function to add new node into the tree
     * @param current
     * @param data
     * @return
     */
    private BinaryTreeNode addRecursive(BinaryTreeNode current, int data) {
        if (current == null) {
            return new BinaryTreeNode(data);
        }
        if (data < current.data) {
            current.leftChild = addRecursive(current.leftChild, data);
        } else if (data > current.data) {
            current.rightChild = addRecursive(current.rightChild,data);
        } else {
            return current;
        }
        return current;
    }

    /**
     * Public implementation of add new node
     * @param value
     */
    public void add(int value) {
        root = addRecursive(root, value);
    }

    /**
     * Private recursive function to delete node in the BTree.
     * @param current
     * @param data
     * @return
     */
    private BinaryTreeNode deleteRecursive(BinaryTreeNode current, int data) {
        if (current == null) {
            return null;
        }
        if (data == current.data) {
            //if current node has neither leftChild nor rightChild, after the node deletion, will return null
            if (current.leftChild == null && current.rightChild == null) {
                return null;
            }
            if (current.leftChild == null) {
                return current.rightChild;
            }
            if (current.rightChild == null) {
                return current.leftChild;
            }
            int smallestValue = findSmallestValue(current.rightChild);
            current.data = smallestValue;
            current.rightChild = deleteRecursive(current.rightChild, smallestValue);
            return current;
        }
        if (data < current.data) {
            current.leftChild = deleteRecursive(current.leftChild, data);
            return current;
        }
        current.rightChild = deleteRecursive(current.rightChild, data);
        return current;
    }

    /**
     * Private function to find the smallest data of the nodes left
     * @param root
     * @return
     */
    private int findSmallestValue (BinaryTreeNode root) {
        return root.leftChild == null ? root.data : findSmallestValue(root.leftChild);
    }

    /**
     * Public implementation of delete
     * @param data
     */
    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    public int count() {
        //todo: to be implemented later
        return 0;
    }
}
