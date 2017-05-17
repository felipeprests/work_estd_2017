package stack;

import org.junit.Assert;
import org.junit.Test;

public class ExerStringReverseTest {

	
	@Test
	public void reverseStringTest(){
		ExerStringReverse t = new ExerStringReverse();
		String texto = "OLA D";
		String result = t.reverseString(texto);
		
		Assert.assertEquals("D ALO", result);
		
		
	}
}
