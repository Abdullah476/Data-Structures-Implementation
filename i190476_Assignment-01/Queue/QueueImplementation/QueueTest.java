import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class QueueTest {

	@Test
	public void testEmpty() {
		Queue myQueue = new Queue(5);
		try {
			for(int i = 1; i <= 5; i++) {
				myQueue.enqueue(i * 5);
			}
			assertFalse(myQueue.empty());
			int value;
			for(int i = 0; i < 5; i++) {
				value = myQueue.dequeue();
			}
			assertTrue(myQueue.empty());
			myQueue.display();	//for coverage purpose	 
		}
		catch(Exception exception) {
			System.out.println(exception);
		}		
	} 
	
	
	@Test
	public void testSize() {
		Queue myQueue = new Queue(5);
		try {
			for(int i = 1; i <= 5; i++) {
				myQueue.enqueue(i * 5);
			}
			myQueue.display();	//for coverage purpose
			int value = 0;
			for(int i = 0; i < 3; i++) {
				value = myQueue.dequeue();
			}
			int expValue = 2;
			assertEquals(expValue,myQueue.size());
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		
		
	}
	
	@Test
	public void testEnqueue() {
		Queue myQueue = new Queue(5);
		try {
			for(int i = 1; i <= 5 ; i++) {
				myQueue.enqueue(i * 10);
			}
			myQueue.enqueue(108); 
		}
		catch(Exception exception) {
			System.out.println(exception); 
		}
	}
	
	@Test
	public void testDequeue() {
		Queue myQueue = new Queue(5);
		try {
			int value = myQueue.dequeue();
		}
		catch(Exception exception) {
			System.out.println(exception); 
		}
	}
	 
	@Test
	public void testEnqueueandDequeue() {
		
		Queue myQueue = new Queue(5);
		try {
			for(int i = 1; i <= 5; i++) {
				myQueue.enqueue(i * 5);
			}
			myQueue.display();	//for coverage purpose
			int expValue = 15;
			int value = 0;
			for(int i = 0; i < 3; i++) {
				value = myQueue.dequeue();
			}
			assertEquals(expValue,value);
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
	}   
	
	@Test
	public void testEnqueueandDequeue1() {
		Queue myQueue = new Queue(5);
		try {
			for(int i = 1; i <= 5; i++) {
				myQueue.enqueue(i * 10);
			}
			
			int expValue = 108;
			int value = 0;
			value = myQueue.dequeue();
			value = myQueue.dequeue();
			value = myQueue.dequeue();
			
			myQueue.enqueue(108);			
			value = myQueue.dequeue();
			value = myQueue.dequeue();
			myQueue.display();
			value = myQueue.dequeue();
			
			System.out.println("Value: " + value);
			assertEquals(expValue, value);		
			//The value should be 108 because it is the last number enqueued
			//But when dequeue it is dequeuing 10 for unknown reason 
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
	}  
	
}
