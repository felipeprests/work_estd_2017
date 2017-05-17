package stack;

import java.util.List;

public interface Stack<E> {
	
	void push(E t);
	
	E pop();
	
	E top();
	
	boolean isEmpty();
	
	int getSize();
	
	List<E> pop(int n);
	
	List<E> clear();
	
	Stack<E> cloneStack();
}
