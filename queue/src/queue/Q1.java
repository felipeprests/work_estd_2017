package queue;

//Dada uma fila de caracteres, 
//retorne uma outra fila contendo apenas os vogais presentes na primeira.
public class Q1 {

	public Queue<Character> q1(Queue<Character> queue){
		
		Queue<Character> res = new LinkedQueue<>();
		
		while(!queue.isEmpty()){
			
			Character ch = queue.dequeue();
			
			if(ch.equals('a') || ch.equals('e') || ch.equals('i') || ch.equals('o') || ch.equals('u')){
				res.enqueue(ch);
			}
		}
		
		return res;
	}
}
