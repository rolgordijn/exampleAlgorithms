package algoritmen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {

	LinkedList<String> linkedlist; 
	
	@Before
	public void setUp() throws Exception {
		linkedlist = new LinkedList<String>("1");
	}
	

	@Test
	public void testFirst() {		
		assertEquals("1", linkedlist.first());
		assertEquals(1, linkedlist.size());
		assertEquals(false, linkedlist.isEmpty());
	}
	
	@Test
	public void testPrepend(){
		linkedlist.prepend("2");
		assertEquals("2", linkedlist.first());
		assertEquals(2, linkedlist.size());
	}
	
	@Test
	public void testTail(){
		linkedlist.prepend("2");
		LinkedList<String> result = linkedlist.tail();
		assertEquals("1", result.first());
	}
	
	@Test
	public void testTailOfALinkedListWithOneElement(){
		LinkedList<String> result = linkedlist.tail();
        assertEquals(null, result.first());
        assertEquals(0,result.size());
	}
	
	@Test
	public void testLast(){
	   assertEquals("1",linkedlist.last());
	   linkedlist.prepend("2");
	   assertEquals("1",linkedlist.last());
	}
}