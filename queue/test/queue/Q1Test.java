package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {
	
	@Test
	public void q1Test(){
		Q1 questao = new Q1();
		
		Queue<Character> filaCaracteres = new ArrayQueue<>();
		filaCaracteres.enqueue('a');
		filaCaracteres.enqueue('r');
		filaCaracteres.enqueue('f');
		filaCaracteres.enqueue('e');
		filaCaracteres.enqueue('i');
		filaCaracteres.enqueue('t');
		
		Queue<Character> res = questao.q1(filaCaracteres);
		Assert.assertTrue(3 == res.getSize());
		Assert.assertEquals(Character.valueOf('a'), res.dequeue());
		Assert.assertEquals(Character.valueOf('e'), res.dequeue());
		Assert.assertEquals(Character.valueOf('i'), res.dequeue());
	}
}
