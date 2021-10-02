import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class StackwithLinkedListTest {

	
	@Test
	public void testPop() {
		StackwithLinkedList myStack = new StackwithLinkedList();
		
		assertEquals(-1,myStack.pop());
	}
	
	@Test
	public void testTop0() {
		StackwithLinkedList myStack = new StackwithLinkedList();
		
		myStack.display();
		assertEquals(-1, myStack.top());
	}
	
	@Test
	public void testTop() {
		StackwithLinkedList myStack = new StackwithLinkedList();
		
		for(int i = 1; i <= 5; i++) {
			myStack.push(i * 15);
		}
		myStack.display();	//for code coverage purpose
		
		int expVal = 45;
		int val = 0;
		
		for(int i = 0; i < 2; i++) {
			val = myStack.pop();
		}
		
		val = myStack.top();
		
		assertEquals(expVal, val);
	}
	
	
	@Test
	public void testPushandPop() {
		StackwithLinkedList myStack = new StackwithLinkedList();
		
		for(int i = 1; i <= 5; i++) {
			myStack.push(i * 15);
		}
		myStack.display();	//for code coverage purpose
		
		int expVal = 15;
		int val = 0;
		
		for(int i = 0; i < 5; i++) {
			val = myStack.pop();
		}
		
		assertEquals(expVal, val);
	}
	
	@Test
	public void testPushandPop1() {
		StackwithLinkedList myStack = new StackwithLinkedList();
		
		for(int i = 1; i <= 5; i++) {
			myStack.push(i * 15);
		}
		myStack.display();	//for code coverage purpose
		
		int expVal = 12;
		int val = 0;
		
		for(int i = 0; i < 5; i++) {
			val = myStack.pop();
		}
		
		for(int i = 2; i < 5; i++) {
			myStack.push(i * 3);
		}
		
		val = myStack.pop();
		
		assertEquals(expVal, val);
	} 
	
	@Test
	public void testSize() {
		StackwithLinkedList myStack = new StackwithLinkedList();
		
		for(int i = 1; i <= 5; i++) {
			myStack.push(i * 15);
		}
		myStack.display();	//for code coverage purpose
		
		int expVal = 15;
		int val = 0;
		
		for(int i = 0; i < 2; i++) {
			val = myStack.pop();
		}
		
		assertEquals(3, myStack.getSize());
	}

}
