package datastructures;

class LinkedNode {

    LinkedNode next;
    int data;

    public LinkedNode(int data) {
        this.data = data;
    }
}

public class LinkedList {

    LinkedNode head;

    /**
     * This function adds a new node at the end of the linked list
     *
     */
    public void append(int data) {
        if (head == null) {
            head = new LinkedNode(data);
            return;
        }

        LinkedNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new LinkedNode(data);
    }

}
