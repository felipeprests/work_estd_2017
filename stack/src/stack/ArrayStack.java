package stack;

public class ArrayStack<E> implements Stack<E> {

	private E[] array = (E[])new Object[20];
	private int position;
	
	//Insere o elemento
	@Override
	public void push(E e) {
		array[position] = e;
		position++;
	}

	@Override
	public E pop() {
		
		if(position == 0 ){
			return null;
		}
		else{
			E temp = array[position - 1];
			array[position - 1] = null;
			position--;
			return temp;
		}
		
	}

	@Override
	public E top() {
		return position == 0 ? null : array[position - 1];
	}

	@Override
	public boolean isEmpty() {
		return position == 0;
	}

	@Override
	public int getSize() {
		return position;
	}

}
