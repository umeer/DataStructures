package datastructures;

/**
 * This class work similarly to the LinkedList<E> from java.util
 */
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

    /**
     * This function adds a new node at the start of the linked list
     *
     */
    public void prepend(int data) {
        LinkedNode newHead = new LinkedNode(data);
        newHead.next = head;
        head = newHead;
    }

    /**
     * This function find a node that has the input value and remove that node
     * from the linked list
     *
     */
    public void delete(int data) {
        if (head == null) {
            return;
        }
        
        if(head.data == data){
        head = head.next;
        }

        LinkedNode current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}
