import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class DequeueTest {
	
	@Test
	public void testLeft() {
		Dequeue myQueue = new Dequeue(5);
		myQueue.addLeft(10);
		myQueue.addLeft(15);
		myQueue.addLeft(100);
		myQueue.addLeft(105);
		myQueue.addLeft(200);
		myQueue.display(); 
		
		int[] expArr = {10,15,100,105,200}; 
		
		assertArrayEquals(expArr, myQueue.array);
	} 
	
	@Test
	public void testRight() {
		Dequeue myQueue = new Dequeue(5);
		myQueue.addRight(10);
		myQueue.addRight(15);
		myQueue.addRight(100);
		myQueue.addRight(105);
		myQueue.addRight(200);
		myQueue.display(); 
		
		int[] expArr = {200,105,100,15,10};
		
		assertArrayEquals(expArr, myQueue.array);
	} 
	
	@Test
	public void testLeftandRight() {
		Dequeue myQueue = new Dequeue(5);
		myQueue.addLeft(10);
		myQueue.addRight(15);
		myQueue.addLeft(100);
		myQueue.addRight(105);
		myQueue.display();	//for code coverage
		myQueue.addRight(200);
		myQueue.addRight(400);
		myQueue.addLeft(300);
		//myQueue.display();
		
		int[] expArr = {10,100,200,105,15};
		
		assertArrayEquals(expArr, myQueue.array);
	} 

}
