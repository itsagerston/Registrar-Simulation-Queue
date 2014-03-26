/**
 * Class ListNode.java creates individual nodes for the Doubly-LinkedList class LL.java.
 * Both ListNode.java and LL.java use generics (type X) to simultaneously maintain
 * flexibility and consistency.
 *
 * @author Aaron Gerston
 */
public class ListNode<X> {
	private X data;
	private ListNode<X> next;
	private ListNode<X> prev;
	
	/**
	 * Creates a new node with given data
	 * @param X D - data of type X
	 */
	public ListNode(X D) {
		data = D;
	}
	
	/**
	 * Sets this node's 'next' pointer to point to a given node
	 *
	 */
	public void setNext(ListNode<X> L) {
		next = L;
	}
	
	/**
	 * Returns the next node
	 * @return ListNode<X> next
	 */
	public ListNode<X> getNext() {
		return next;
	}
	
	/**
	 * Sets this node's 'previous' pointer to point to a given node
	 */
	public void setPrev(ListNode<X> L) {
		prev = L;
	}
	
	/**
	 * Returns the previous node
	 * @return ListNode<X> prev
	 */
	public ListNode<X> getPrev() {
		return prev;
	}
	
	/**
	 * Returns the data from the node
	 * @return X data
	 */
	public X getData() {
		return data;
	}
	
	/**
	 * Outputs data from the node.
	 */
	public void print(){
		if (data == null) {
			System.out.println("null");
		}
		else {
			System.out.println(data.toString());
		}
	}
}
