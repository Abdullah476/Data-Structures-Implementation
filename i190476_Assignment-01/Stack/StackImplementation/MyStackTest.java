import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class MyStackTest {

	
	@Test
	public void testPush() {
		MyStack myStack = new MyStack(5);
		try { 
			for(int i = 0; i < 6; i++) {
				myStack.push(i * 10);
			}
		} 
		catch(Exception exception) {
			//fail("Push Error");
			System.out.println(exception);
		}
	}
	
	@Test
	public void testPop() {
		MyStack myStack = new MyStack(5);
		try {
			int value = myStack.pop();
		}
		catch(Exception exception) {
			//fail("Pop Error");
			System.out.println(exception);
		}
	}
	
	
	
	@Test
	public void testSize() {
		MyStack myStack = new MyStack(5);
		try {
			for(int i = 0; i < 3; i++) {
				myStack.push(i * 2);
			}
		}
		catch(Exception exception) {
			//fail("Push Error");
			System.out.println(exception);
		}
		
		int expValue = 3;
		assertEquals(expValue, myStack.size());
		
	}
	
	@Test
	public void testSize1() {
		MyStack myStack = new MyStack(5);
		assertEquals(0,myStack.size());
	}
	
	@Test
	public void testTop0() {
		MyStack myStack = new MyStack(5);
		
		try {
			int value = myStack.top();
		}
		catch(Exception exception) {
			//fail("Top Error");
			System.out.println(exception);
		}
	}
	
	@Test 
	public void testTop() {
		MyStack myStack = new MyStack(5);
		try {
			for(int i = 0; i < 5; i++) {
				myStack.push(i * 2);
			}
		}
		catch(Exception exception) {
			//fail("Push Error");
			System.out.println(exception);
		}
		int expValue = 8;
		int value = 0;
		
		try {
			value = myStack.top();
		}
		catch(Exception exception) {
			//fail("Top Error");
			System.out.println(exception);
		}
		
		assertEquals(expValue, value);
	}
	
	
	@Test
	public void testPushandPop() {
		MyStack myStack = new MyStack(5);
		try {
			
			for(int i = 1; i <= 5; i++) {
				myStack.push(i * 5);
			}
		}
		catch(Exception exception) {
			//fail("Push Error");
			System.out.println(exception);
		}	
		
		int expValue = 20;
		int value = 0;
		try {
			
			for(int i = 0; i < 2; i++) {
				value = myStack.pop();
			}
		}
		catch(Exception exception) {
			//fail("Pop Error");
			System.out.println(exception);
		}
		
		myStack.displayStack();	//for code coverage
		
		assertEquals(expValue, value);
	}

}
