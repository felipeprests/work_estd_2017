package queue;

import java.util.Iterator;

//Dada um número inteiro n, 
//retorne uma fila contendo todos os números maiores que zero e menores que n.
public class Q4 {

	public Queue<Integer> q4(int n){
		
		Queue<Integer> filaResult = new ArrayQueue<>();
		
		for (int i = 1; i < n; i++) {
			filaResult.enqueue(i);
		}
		
		return filaResult;
	}
}
