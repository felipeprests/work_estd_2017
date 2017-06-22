package queue;

import org.junit.Assert;
import org.junit.Test;



public class Q2Test {

	@Test
	public void q2Test(){
		Q2 quest2 = new Q2();
		
		Double[] a = {2.0, 3.0};
		Double[] b = {4.0, 5.0};
		
		Queue<Double> resul = quest2.q2(a, b);
		
		Assert.assertEquals(Double.valueOf(8.0), resul.dequeue());
		Assert.assertEquals(Double.valueOf(27.0), resul.dequeue());
		Assert.assertEquals(Double.valueOf(64.0), resul.dequeue());
		Assert.assertEquals(Double.valueOf(125.0), resul.dequeue());
	}
}
