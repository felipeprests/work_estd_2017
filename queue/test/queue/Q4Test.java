package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {

	@Test
	public void q4Test(){
		Q4 quest = new Q4();
		
		Queue<Integer> resul = quest.q4(3);
		
		Assert.assertTrue(resul.getSize() == 2);
		Assert.assertEquals(Integer.valueOf(1), resul.dequeue());
		Assert.assertEquals(Integer.valueOf(2), resul.dequeue());
	}
}
