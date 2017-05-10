package stack;

import org.junit.Assert;
import org.junit.Test;



public class ArrayStackTest {
	
	@Test
	public void pushTest(){		
		
		Stack<String> stack = new ArrayStack<>();
		
		Assert.assertTrue(stack.isEmpty());
		Assert.assertEquals(0, stack.getSize());
		
		stack.push("A");
		stack.push("B");
		stack.push("C");

		
		Assert.assertFalse(stack.isEmpty());
		Assert.assertEquals(3, stack.getSize());
	}
	
	@Test
	public void topTest(){
		
		Stack<Integer> stack = new ArrayStack<>();
		
		Assert.assertNull(stack.top());
		
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		Assert.assertEquals(Integer.valueOf(3), stack.top());
		Assert.assertEquals(3, stack.getSize());
		

	}
	
	

	
}
