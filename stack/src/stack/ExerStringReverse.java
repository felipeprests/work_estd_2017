package stack;


public class ExerStringReverse {

	
	public String reverseString(String text){
		
		ArrayStack<Character> array = new ArrayStack<>();
		String textres ="";
		char[] tmp = text.toCharArray();
		
		for (int i = 0; i < tmp.length; i++) {
			array.push(tmp[i]);
		}
		
		for (int i = 0; i < tmp.length; i++) 
		{
			Character e = array.pop();
		
			if(e != null){
				textres += e; 
			}
			
		}
		return textres;
	}
	
	
	

}
