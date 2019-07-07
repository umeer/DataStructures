package datastructures;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    /**
     * Test of custom class LinkedListStructure.
     */
    @Test
    public void testAppend() {
        LinkedListStructure list = new LinkedListStructure();
        list.append(1);
        list.append(2);
       assertEquals(list.toStringHeadToTail().compareTo("1 2"), 0);
    }
    
    @Test
    public void testPrepend() {
        LinkedListStructure list = new LinkedListStructure();
        list.append(1);
        list.append(2);
        list.prepend(0);
       assertEquals(list.toStringHeadToTail().compareTo("0 1 2"), 0);
    }
    
     @Test
    public void testEmpty() {
        LinkedListStructure list = new LinkedListStructure();
       assertEquals(list.toStringHeadToTail().compareTo(""), 0);
    }
    
    @Test
    public void testDelete() {
        LinkedListStructure list = new LinkedListStructure();
        list.append(1);
        list.append(2);
        list.prepend(0);
        list.delete(1);
       assertEquals(list.toStringHeadToTail().compareTo("0 2"), 0);
    }

}
