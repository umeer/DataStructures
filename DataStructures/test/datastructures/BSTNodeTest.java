package datastructures;

import org.junit.Test;
import static org.junit.Assert.*;

public class BSTNodeTest {

    public BSTNodeTest() {
    }

    /**
     * Test of BSTNode.
     */
    @Test
    public void testBSTBasic() {
        BSTNode tree = new BSTNode(50);
        tree.insert(20);
        tree.insert(60);
        assertEquals(tree.toStringInOrder().compareTo("20 50 60"), 0);
    }

    @Test
    public void testBSTMax() {
        BSTNode tree = new BSTNode(50);
        tree.insert(20);
        tree.insert(60);
        assertEquals(tree.max(), 60);
    }

    @Test
    public void testBSTMin() {
        BSTNode tree = new BSTNode(50);
        tree.insert(20);
        tree.insert(25);
        tree.insert(60);
        tree.insert(55);
        tree.insert(61);
        assertEquals(tree.min(), 20);
    }

    @Test
    public void testBSTContain() {
        BSTNode tree = new BSTNode(50);
        tree.insert(20);
        assertEquals(tree.contains(20), true);
    }

    @Test
    public void testBSTContainFalse() {
        BSTNode tree = new BSTNode(50);
        tree.insert(20);
        assertNotEquals(tree.contains(100), true);
    }

}
