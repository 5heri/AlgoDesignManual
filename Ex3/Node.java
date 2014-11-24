public class Node {
	
	private int value;
	private Node next;

	public Node(int value) {
		this.value = value;
		next = null;
	}

	public void setValue(int newValue) {
		value = newValue;
	}

	public void setNext(Node newNext) {
		next = newNext;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	@Override
	public String toString() {
		return value + " ";
	}

}

