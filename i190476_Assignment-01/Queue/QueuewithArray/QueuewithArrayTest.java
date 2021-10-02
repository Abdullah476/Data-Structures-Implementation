import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class QueuewithArrayTest {

	
	@Test
	public void testEnqueue0() {
		QueuewithArray myQueue = new QueuewithArray(5);
		for(int i = 0; i <= 4; i++){
			myQueue.enqueue(i * 6);
		}
		myQueue.display();
		myQueue.enqueue(25);
		
	}
	
	@Test
	public void testEnqueue1() {
		QueuewithArray myQueue = new QueuewithArray(5);
		for(int i = 0; i <= 4; i++){
			myQueue.enqueue(i * 6);
		}
		int value = myQueue.dequeue();
		myQueue.enqueue(25);
		
		for(int i  = 0; i < 3; i++) {
			value = myQueue.dequeue();
		}
		int expValue = 18;
		assertEquals(expValue,value);
		
	}	
	
	@Test
	public void testDequeue() {
		QueuewithArray myQueue = new QueuewithArray(5);
		myQueue.display();
		for(int i = 1; i <= 5; i++) {
			myQueue.enqueue(i * 5);
		}
		myQueue.display();	//for coverage purpose
		
		int expValue = -1;
		int value = 0;
		
		for(int i = 0; i <= 5; i++) {
			value = myQueue.dequeue();
		}
		
		assertEquals(expValue,value);
	}
	
	@Test
	public void testDequeue1() {
		QueuewithArray myQueue = new QueuewithArray(5); 
		for(int i = 1; i <= 5; i++) {
			myQueue.enqueue(i * 10);
		}
		int value = 0;
		value = myQueue.dequeue();
		myQueue.enqueue(108);
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		myQueue.enqueue(208);
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		
		int expValue = 208;
		
		assertEquals(expValue,value);
		
	}	
	
	@Test
	public void testEnqueueandDequeue() {
		
		QueuewithArray myQueue = new QueuewithArray(5);
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

}
