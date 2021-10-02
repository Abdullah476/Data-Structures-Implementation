import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class LinkedListImpTest {
	
	@Test
	public void testLinkedList() {
		LinkedListImp myList = new LinkedListImp();
		try{
			myList.add(10);
			myList.popFront();
			myList.add(20);
			myList.pushFront(30);
			myList.add(40);
			myList.add(50);
			myList.display();	//for code coverage
			
			int expVal = 4;
			assertEquals(expVal, myList.size());
			
			expVal = 30;
			assertEquals(expVal, myList.topFront());
			
			myList.popFront();
			
			expVal = 50;
			assertEquals(expVal, myList.topBack());
				
			int[] expArray = {20,40,50};
			assertArrayEquals(expArray, myList.checkList());
			
			myList.pushBack(60);	
			myList.add(70);
			myList.pushFront(80);
			
			int[] expArray1 = {80,20,40,50,60,70};
			assertArrayEquals(expArray1, myList.checkList());
			
			myList.popFront();
			myList.popFront();
			myList.popFront();
			myList.popFront();
			myList.popFront();
			myList.popFront();
			
			myList.pushFront(101);
			myList.popFront();
			
			myList.pushBack(101);
			
			expVal = 1;
			assertEquals(expVal, myList.size());			
		}
		catch(Exception exception){
			System.out.println(exception);
		}
		
		//Cases to test if it throws exception and for code coverage
		try {
			myList.popFront();
			myList.popFront();
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		
		try {
			int value = 0;
			value = myList.topBack();
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		
		try {
			int value = 0;
			value = myList.topFront();
		}
		catch(Exception exception) {
			System.out.println(exception);
		}		
	}
	
	

}
