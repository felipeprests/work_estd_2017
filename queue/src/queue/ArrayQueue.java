package queue;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

public class ArrayQueue<E> implements Queue<E> {

	private E[] array;
	private int head = 0;
	private int tail = 0;
	private int size = 0;

	public ArrayQueue(int size) {
		array = (E[]) new Object[size];
	}

	public ArrayQueue() {
		array = (E[]) new Object[20];
	}

	@Override
	public void enqueue(E e) {

		if (isFull()) {
			E[] temp = (E[]) new Object[array.length * 2];
			// copiar organizado
			int n = head;
			for (int i = 0; i < array.length; i++) {
				n = n % array.length;
				temp[i] = array[n];
				n++;
			}
			head = 0;
			tail = array.length;
			array = temp;
		} 
			array[tail] = e;
			tail = (tail + 1) % array.length;
			size++;
			System.out.println(Arrays.toString(array));
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			E aux = array[head];
			array[head] = null;
			head = (head + 1) % array.length;
			size--;
			System.out.println(Arrays.toString(array));
			return aux;
		}
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E front() {
		return array[head];
	}

	@Override
	public int getSize() {
		return size;
	}

	public boolean isFull() {
		return getSize() == array.length;
	}
}
