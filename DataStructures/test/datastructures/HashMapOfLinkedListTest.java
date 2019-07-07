package datastructures;

import org.junit.Test;
import static org.junit.Assert.*;

public class HashMapOfLinkedListTest {
    
    /**
     * Test of class HashMapOfLinkedList
     */
    @Test
    public void testAdd() {
        HashMapOfLinkedList map = new HashMapOfLinkedList();
        map.add("Mohammad","Umeer");
        java.util.LinkedList<String> list = map.retrive("Mohammad");        
        assertEquals(((String)list.getFirst()).compareTo("Umeer"), 0);
    }
    
    @Test
    public void testAddMultiple() {
        HashMapOfLinkedList map = new HashMapOfLinkedList();
        map.add("Mohammad","Umeer");
        map.add("Cruise","Tom");

        java.util.LinkedList<String> list = map.retrive("Mohammad");        
        assertEquals(((String)list.getFirst()).compareTo("Umeer"), 0);
        
        list = map.retrive("Cruise");        
        assertEquals(((String)list.getFirst()).compareTo("Tom"), 0);
    }
    
     @Test
    public void testConcurrency() {
        HashMapOfLinkedList map = new HashMapOfLinkedList();
        map.add("Mohammad","Umeer");
        map.add("Mohammad","Z");
        map.add("Mohammad","A");

        java.util.LinkedList<String> list = map.retrive("Mohammad");        
        assertEquals(((String)list.getFirst()).compareTo("Umeer"), 0);
        assertEquals(((String)list.get(1)).compareTo("Z"), 0);
        assertEquals(((String)list.get(2)).compareTo("A"), 0);
    }

    @Test
    public void testToStringHashMap() {
        HashMapOfLinkedList map = new HashMapOfLinkedList();
        map.add("m","Umeer");
        map.add("a","Z");
        map.add("p","A");

        System.out.println(map.toStringHashMap());
        assertEquals(map.toStringHashMap().compareTo("p a m"), 0);
        
    }

    
}
