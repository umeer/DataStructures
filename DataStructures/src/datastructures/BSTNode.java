package datastructures;

/**
 * This code is the logic representation of a binary search tree
 *
 */
public class BSTNode {

    BSTNode left, right;
    int data;

    public BSTNode(int data) {
        this.data = data;
    }

    /**
     * Insert a value in the tree (left small right is big)
     *
     */
    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new BSTNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BSTNode(value);
            } else {
                right.insert(value);
            }
        }
    }

    /**
     * Check if the tree contains a value
     *
     */
    public boolean contains(int value) {
        if (data == value) {
            return true;
        }

        if (value <= data) {
            if (left != null) {
                return left.contains(value);
            }
            return false;
        } else {
            if (right != null) {
                return right.contains(value);
            }
            return false;
        }
    }

    /**
     * This can be used to print the tree (order from small to big)
     *
     */
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    /**
     * This can be used to find the larget value in the tree
     *
     */
    public int max() {
        if (right == null) {
            return data;
        } else {
            return right.max();
        }
    }
    /**
     * This can be used to find the smallest value in the tree
     *
     */
    public int min() {
        if (left == null) {
            return data;
        } else {
            return left.min();
        }
    }

}
