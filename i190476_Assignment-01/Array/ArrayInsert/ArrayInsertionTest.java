import static org.junit.Assert.*; 
import org.junit.*;
import org.junit.Test;


public class ArrayInsertionTest {
	
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test0() {
		ArrayInsertion.size = 11;
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] expArr = {1,2,3,100,4,5,6,7,8,9,10,11,12}; 
		
		assertArrayEquals(expArr, ArrayInsertion.insert(arr, 100, 3));
		
	} 
	
	@Test
	public void test1() {
		ArrayInsertion.size = 10; 
		int[] arr = new int [10];
		int[] expArr = new int [10];
		assertArrayEquals(expArr, ArrayInsertion.insert(arr, 54, 4));
	}
	
	
	@Test
	public void test2(){
		ArrayInsertion.size = 0;
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		int[] expArr = {1,2,3,100,5,6,7,8,9,10,11}; 
		
		assertArrayEquals(expArr, ArrayInsertion.insert(arr, 100, 3));
	}

	@Test
	public void test3() {
		ArrayInsertion.size = 5;
		int[] arr = new int[8];
		arr[0] = 1; arr[1] = 2; arr[2] = 3;
		arr[3] = 4; arr[4] = 5;
		int[] expArr = {1,2,3,100,4,5,0,0};		
		
		assertArrayEquals(expArr, ArrayInsertion.insert(arr, 100, 3));
		
	} 

}
