import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class QueuewithLinkedListTest {

	@Test
	public void testEnqueueandDequeue() {
		
		QueuewithLinkedList myQueue = new QueuewithLinkedList();
		
		for(int i = 1; i <= 10; i++)
		{
			myQueue.enqueue(i * 10);
		}
		
		myQueue.display();	//for coverage purpose
		
		int expVal = 50;
		int val = 0;
		for(int i = 0; i < 5; i++) {
			val = myQueue.dequeue();
		}
		
		assertEquals(expVal, val);
		
		
	}
	
	@Test
	public void testEnqueueandDequeue1() {
		
		QueuewithLinkedList myQueue = new QueuewithLinkedList();
		
		for(int i = 1; i <= 10; i++)
		{
			myQueue.enqueue(i * 10);
		}
		
		myQueue.display();
		
		int expVal = 100;
		int val = 0;
		for(int i = 0; i < 10; i++) {
			val = myQueue.dequeue();
		}
		
		myQueue.display();
		
		assertEquals(expVal, val);
		
		val = myQueue.dequeue();
		
	}
	
	@Test
	public void testEnqueueandDequeue2() {
		
		QueuewithLinkedList myQueue = new QueuewithLinkedList();
		
		for(int i = 1; i <= 10; i++)
		{
			myQueue.enqueue(i * 10);
		}
		
		int expValue = 108;
		int value = 0;
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		myQueue.enqueue(108);
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		value = myQueue.dequeue();
		
		assertEquals(expValue, value);
		
	}

}
