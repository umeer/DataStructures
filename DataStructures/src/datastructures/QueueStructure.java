package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStructure {

    Queue<String> queue;

    public QueueStructure() {
        queue = new LinkedList<>();
    }

    /**
     * add elements to the queue
     *
     * @param element
     */
    public void add(String element) {
        queue.add(element);
    }

    /**
     * return and remove the oldest element in the queue
     */
    public String remove() {
        return queue.poll();
    }

    /**
     * return the oldest element in the queue
     *
     * @return
     */
    public String howIsNext() {
        return queue.element();
    }

    /**
     * return a list of all the element in the queue
     *
     * @return
     */
    public String toStringQueue() {
        String output = "";

        if (queue == null) {
            return output;
        }

        for (String value : queue) {
            output = (output.length() == 0) ? output + value : output + " " + value;
        }
        return output;
    }
}
