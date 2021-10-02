import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class CircularLinkedListTest {

	@Test
    public void testPushFront() {
		CircularLinkedList myList = new CircularLinkedList();
		myList.pushFront(10);
		myList.pushFront(20);
		myList.pushFront(30);
		myList.pushFront(40);
		myList.pushFront(50);
		
        int [] expArray = {50, 40, 30, 20, 10};        
        assertArrayEquals(expArray, myList.checkList());
    } 

    @Test
    public void testPushBack() {
    	CircularLinkedList myList = new CircularLinkedList();
		myList.pushBack(10);
		myList.pushBack(20);
		myList.pushBack(30);
		myList.pushBack(40);
		myList.pushBack(50);
		myList.display();   //for coverage purpose
       
		int [] expectedArray = {10, 20, 30, 40, 50};
        assertArrayEquals(expectedArray, myList.checkList());
    }
    
    @Test
    public void testPopFront() {
    	CircularLinkedList myList = new CircularLinkedList();
    	myList.pushFront(10);
    	myList.pushFront(20);
    	myList.pushFront(30);
    	myList.pushFront(40);
    	myList.pushFront(50);
    	myList.popFront();
    	myList.popFront();
    	myList.popFront();
    	myList.popFront();
    	myList.display();
    	
    	int[] expArray = {10};        
        assertArrayEquals(expArray, myList.checkList());
        
        myList.popFront();
        myList.popFront();

        int[] expArray1 = {};
        myList.display(); //for code coverage purpose
        
        assertArrayEquals(expArray1, myList.checkList());
    }

    @Test
    public void testPopBack() {
    	CircularLinkedList myList = new CircularLinkedList();
    	myList.pushFront(10);
    	myList.pushFront(20);
    	myList.pushFront(30);
    	myList.pushFront(40);
    	myList.pushFront(50);
    	myList.popBack();
    	myList.popBack();
    	myList.popBack();
    	
        int [] expArray = {50,40};
        assertArrayEquals(expArray, myList.checkList());
        
        myList.popBack();
    	myList.popBack();
    	myList.popBack();
    	
        int [] expArray1 = {};
        assertArrayEquals(expArray1, myList.checkList());
    }

}
