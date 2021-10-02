import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ArrayDeletionTest {
 
	@Test
	public void test0() throws NoSuchMethodException,
    InvocationTargetException, IllegalAccessException {
		
		int[] arr = {1,2,3,4,5};
		int[] expArr = {1,2,3,4,5};
		
		Method method = ArrayDeletion.class.getDeclaredMethod("delete", int[].class, int.class);
		method.setAccessible(true);
		ArrayDeletion arrDel = new ArrayDeletion();
		int[] result = (int[]) method.invoke(arrDel, arr, 5);
		
		assertArrayEquals(expArr,result);
		
	}
	
	@Test
	public void test1() throws NoSuchMethodException,
    InvocationTargetException, IllegalAccessException {
		
		int[] arr = {1,2,3,4,5};
		int[] expArr = {1,2,3,4,5};
		
		Method method = ArrayDeletion.class.getDeclaredMethod("delete", int[].class, int.class);
		method.setAccessible(true);
		ArrayDeletion arrDel = new ArrayDeletion();
		int[] result = (int[]) method.invoke(arrDel, arr, -1);
		
		assertArrayEquals(expArr,result);
		
	}
	
	@Test
	public void test2() throws NoSuchMethodException,
    InvocationTargetException, IllegalAccessException {
		
		int[] arr = {1,2,3,4,5};
		int[] expArr = {1,2,4,5,-1};
		
		Method method = ArrayDeletion.class.getDeclaredMethod("delete", int[].class, int.class);
		method.setAccessible(true);
		ArrayDeletion arrDel = new ArrayDeletion();
		int[] result = (int[]) method.invoke(arrDel, arr, 2);
		
		assertArrayEquals(expArr,result);
		
	}
	
	@Test
	public void test3() throws NoSuchMethodException,
    InvocationTargetException, IllegalAccessException {
		
		int[] arr = {1,2,3,4,5};
		int[] expArr = {1,2,3,4,-1};
		
		Method method = ArrayDeletion.class.getDeclaredMethod("delete", int[].class, int.class);
		method.setAccessible(true);
		ArrayDeletion arrDel = new ArrayDeletion();
		int[] result = (int[]) method.invoke(arrDel, arr, 4);
		
		assertArrayEquals(expArr,result);
		
	}
	
	@Test
	public void test4() throws NoSuchMethodException,
    InvocationTargetException, IllegalAccessException {
		
		int[] arr = {1,2,3,4,5};
		int[] expArr = {2,3,4,5,-1};
		
		ArrayDeletion.display(arr);	//Just for code coverage
		
		Method method = ArrayDeletion.class.getDeclaredMethod("delete", int[].class, int.class);
		method.setAccessible(true);
		ArrayDeletion arrDel = new ArrayDeletion();
		int[] result = (int[]) method.invoke(arrDel, arr, 0);		
		
		assertArrayEquals(expArr,result);
		
	}

}
