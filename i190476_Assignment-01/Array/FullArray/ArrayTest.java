import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;


public class ArrayTest {
	
	@Test
	public void testLinerSearch() {		
		
		Array.array = new int [100];
		Array.size = 5;
		
		Array.insert(10, 5);
		Array.insert(11, 7);
		Array.insert(12, 4);
		Array.insert(20, 8);
		Array.insert(19, 2);
		
		assertTrue(Array.linearSearch(20));	
		assertFalse(Array.linearSearch(21));			
	}
	
	@Test
	public void testBinarySearch() {		
		
		Array.array = new int [100];
		Array.size = 5;
		
		Array.insert(10, 5);
		Array.insert(11, 7);
		Array.insert(12, 4); 
		Array.insert(20, 8);
		Array.insert(19, 2);
		
		assertTrue(Array.binarySearch(20, 2, 9));	
		assertFalse(Array.binarySearch(13,2,9));			
	}
	
	@Test
	public void testBubbleSort() {
		Array.array = new int [6];  
		Array.size = 5;
		Array.array[0] = 19; Array.array[1] = 20; Array.array[2] = 12;
		Array.array[3] = 11; Array.array[4] = 10;
		Array.insert(100, 3);
		Array.bubbleSort();		
		Array.display();
		int[] expArray = {10,11,12,19,20,100};
		
		assertArrayEquals(expArray,Array.array);
	} 
	
	@Test
	public void testDelete() {
		Array.array = new int [6];  
		Array.size = 5;
		Array.array[0] = 19; Array.array[1] = 20; Array.array[2] = 12;
		Array.array[3] = 11; Array.array[4] = 10;
		Array.insert(100, 3);		
		Array.delete(3);
		int[] expArr = {19,20,12,11,10,10};
		Array.display();
		
		assertArrayEquals(expArr,Array.array);
	}

}
