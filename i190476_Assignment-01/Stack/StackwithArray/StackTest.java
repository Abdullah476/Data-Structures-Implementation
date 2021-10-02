import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class StackTest {

	@Test
	public void testPush() {
		Stack.array = new int[5]; 
		Stack.size = 5;
		Stack.addPointer = 0;
		
		for(int i = 0; i < 6; i++) {
			Stack.push(i * 12);
		} 
	}
	
	@Test
	public void testPop() {
		Stack myStack = new Stack();
		myStack.display();	//for code coverage purpose
		
		assertEquals(-1,myStack.pop());
	}
	 
	@Test
	public void testPushandPop() {
		Stack myStack = new Stack();
		
		for(int i = 0; i < 10; i++) {
			myStack.push(i * 5);
		}
		int expVal = 35;
		int val = 0;
		for(int i = 0; i < 3; i++) {
			val = myStack.pop();
		}
		
		myStack.display();//for code coverage purpose
		
		assertEquals(expVal, val);	
		
	}
	
	@Test
	public void testPushandPop1() {
		Stack myStack = new Stack();
		
		for(int i = 0; i < 10; i++) {
			myStack.push(i * 5);
		}
		
		int expVal = 0;
		int val = 0;
		val = myStack.pop();
		val = myStack.pop();
		val = myStack.pop();
		val = myStack.pop();
		val = myStack.pop();
		myStack.push(108);
		val = myStack.pop();
		val = myStack.pop();
		val = myStack.pop();
		val = myStack.pop();
		val = myStack.pop();
		val = myStack.pop();
		
		myStack.display();//for code coverage purpose
		
		assertEquals(expVal, val);	
		
	}

}
