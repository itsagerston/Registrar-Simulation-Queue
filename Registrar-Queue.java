/**
 * regQueue is a queue interface based off of LinkedList-like LL.java,
 * that is designed to be used for the simulation registrar.java
 *
 * @author Aaron Gerston
 */
public class regQueue<X> {
	protected LL<X> queue;

	/**
	 * Constructs the queue...
	 */
	public regQueue() {
		queue = new LL<X>();
	}
	
	/**
	 * Inserts given object into the back of the queue (back of the line)
	 */
	public void enqueue(X D) {
		queue.insertBack(D);
	}
	
	/**
	 * Removes the first object in the queue (first in line)
	 */
	public X dequeue() {
		if (queue.first == null) {
			return null;
		}
		return queue.removeFirst();
	}
	
	/**
	 * Returns the first object in the queue
	 * @return queue.first - the first node in LL "queue"
	 */
	public X firstInLine() {
		if (queue.first == null) {
			return null;
		}
		return queue.first.getData();
	}
	
	/**
	 * Returns the last object in the queue
	 * @return queue.last - the last node in LL "queue"
	 */
	public X lastInLine() {
		if (queue.last == null) {
			return null;
		}
		return queue.last.getData();
	}
	
	public X getData(int ind) {
		return queue.getData(ind);
	}
	
	/**
	 * Returns the size of the queue
	 * @return queue.numNodes - number of nodes in LL "queue"
	 */
	public int size() {
		return queue.numNodes;
	}
}
