package datastructures;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueStructureTest {

    /**
     * Test of add method, of class QueueStructure.
     */
    @Test
    public void testAdd() {
        QueueStructure queue = new QueueStructure();
        queue.add("Umeer");
        assertEquals(queue.howIsNext().compareTo("Umeer"), 0);
    }

    @Test
    public void testAddMultiple() {
        QueueStructure queue = new QueueStructure();
        queue.add("Umeer");
        queue.add("Z");
        assertEquals(queue.howIsNext().compareTo("Umeer"), 0);
    }

    @Test
    public void testRemove() {
        QueueStructure queue = new QueueStructure();
        queue.add("Umeer");
        queue.add("Z");
        queue.remove();
        assertEquals(queue.howIsNext().compareTo("Z"), 0);
    }
    
      @Test
    public void testPrint() {
        QueueStructure queue = new QueueStructure();
        queue.add("X");
        queue.add("U");
        queue.add("Z");
        queue.add("A");
        queue.remove();
        assertEquals(queue.toStringQueue().compareTo("U Z A"), 0);
    }

}
