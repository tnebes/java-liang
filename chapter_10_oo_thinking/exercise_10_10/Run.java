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
 * 
 * Implement the class with size to 8
 * The array size will be doubled once the number of elements
 * exceed the size
 * Write a test program that adds 20 numbers from 1 to 20 into the queue then removes these
 * numbers and displays them.
 */
public class Run {

	public static void main(String[] args) {
		Queue myQueue = new Queue();
		final int MAX = 20;
		// fill
		for (int i = 0; i < MAX; i++) {
			myQueue.enqueue(i);
		}
		// print
		for (int i = 0; !myQueue.empty(); i++) {
			System.out.printf("%d ", myQueue.dequeue());
		}

	}

}
