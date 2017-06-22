package queue;

public interface Queue<E> {
	
	void enqueue(E e);
	
	E dequeue();
	
	boolean isEmpty();
	
	E front();
	
	int getSize();
		
	
}
