package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {
	
	@Test
	public void q3Test(){
		
		Q3 q3 = new Q3();
		
		Queue<Integer> queue = new ArrayQueue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		int result = q3.q3(queue);
		
		Assert.assertTrue(result == 6);
	}
}
