package stack;

public interface Stack<E> {
	
	void push(E t);
	
	E pop();
	
	E top();
	
	boolean isEmpty();
	
	int getSize();
	
}
