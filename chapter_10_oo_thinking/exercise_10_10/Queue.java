/*
 * Design a class named Queue for storing ints
 * In a queue, the elements are retrieved in a first-in first-out fashion
 * The class contains:
 * 	int[] elements
 * 	size : number of elements
 * 	Queue() capacity 8
 * 	enqueue(int v) adds v
 * 	dequeue() returns and removes element
 * 	empty() : boolean
 * 	getSize() : size of queue
 */
public class Queue {

	private int[] elements;
	private int index = 0;

	/**
	 * no-arg Constructor
	 */
	public Queue() {
		this(8);
	}

	/**
	 * Constructor
	 * 
	 * @param capacity
	 */
	public Queue(int capacity) {
		elements = new int[capacity];
	}

	/**
	 * Adds v to the Queue. If end of Queue is reached, overflow.
	 * 
	 * @param v
	 */
	public void enqueue(int v) {
		if (index == elements.length) {
			enlargeQueue();
			elements[index++] = v;
		} else {
			elements[index++] = v;
		}
	}

	/**
	 * Doubles the size of the queue
	 */
	public void enlargeQueue() {
		int[] newElements = new int[elements.length * 2];
		for (int i = 0; i < elements.length; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
	}

	/**
	 * Removes and returns the first item in the queue. Moves the elements to the
	 * left.
	 * 
	 * @return int
	 */
	public int dequeue() {
		int temp = elements[0];
		sort();
		return temp;
	}

	/**
	 * Moves all elements one place to the left
	 */
	private void sort() {
		for (int i = 0; i < elements.length - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[elements.length - 1] = 0;
		if (index != 0) {
			index--;
		}
	}

	/**
	 * Returns true if Queue is empty.
	 * 
	 * @return
	 */
	public boolean empty() {
		return index == 0 ? true : false;
	}

	/**
	 * Returns number of elements;
	 * 
	 * @return
	 */
	public int getSize() {
		return index;
	}

}
