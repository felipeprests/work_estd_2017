package queue;

import java.util.Iterator;

//Dados dois arranjos de números decimais, 
//retorne uma fila contendo todos os itens dos dois elevados ao cubo.

public class Q2 {
	
	public Queue<Double> q2(Double[] a, Double[] b){
		
		Queue<Double> resul = new ArrayQueue<>();
		
		for (Double dec : a) {
			resul.enqueue(Math.pow(dec, 3));
		}
		
		for (Double dec : b) {
			resul.enqueue(Math.pow(dec, 3));
		}
		
		return resul;
	}
}
