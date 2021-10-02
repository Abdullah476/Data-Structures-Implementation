import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testLinkedList() {
		LinkedList myList = new LinkedList();
		
		myList.display();//for code coverage purpose
		myList.popFront();
		myList.popBack();
		myList.pop(0);
		myList.pushFront(10);
		myList.popBack();
		myList.pushBack(20);
		myList.pop(0);
		myList.pushBack(20);
		myList.pushFront(30);
		myList.pushFront(40);
		myList.pushBack(50);
		myList.pop(3);
		myList.popFront();
		myList.popBack();
		myList.pushFront(108);
		myList.pushBack(208);
		myList.display();//for code coverage purpose
		
		int[] expArray = {108,30,208};
		assertArrayEquals(expArray, myList.checkList());	
		
		myList.pop(4);
		myList.popBack();
		myList.popBack();
		myList.popBack();
		int[] expArray1 = {};
		assertArrayEquals(expArray1, myList.checkList());
		
	} 
	
	//Negative values not handled in Pop function test fails
	@Test
	public void testPop() {
		LinkedList myList = new LinkedList();
		myList.pushBack(10);
		myList.pushBack(20);
		myList.pushBack(30);
		myList.pushBack(40);
		myList.pushBack(50);
		
		myList.pop(0);
		myList.pop(1);
		myList.pop(-1);
		myList.display();
		
		int[] expArray = {20,40,50};
		assertArrayEquals(expArray, myList.checkList());

	}
}
