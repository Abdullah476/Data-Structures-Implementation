import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class LinkedListSwapTest {

	@Test
	public void testSwap() {
		LinkedListSwap myList = new LinkedListSwap();
		
		myList.swap();
		myList.display();//for code coverage purpose
		myList.pushFront(10);
		myList.swap();
		myList.pushFront(20);
		myList.pushFront(30);
		myList.pushFront(40);
		myList.display();//for code coverage purpose
		myList.swap();
		
		int[] expArray = {10,30,20,40};
		assertArrayEquals(expArray, myList.checkList());
		
	}
	
	@Test
	public void testSwap1() {
		LinkedListSwap myList = new LinkedListSwap();
		
		myList.swap();
		myList.display();//for code coverage purpose
		myList.pushBack(10);
		myList.pushBack(20);
		myList.pushBack(30);
		myList.pushBack(40);
		myList.display();//for code coverage purpose
		myList.swap();
		
		int[] expArray = {40,20,30,10};
		assertArrayEquals(expArray, myList.checkList());
		
	}

}
