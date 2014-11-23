public class NodeDouble {
	
	private int value;
	private NodeDouble prev;
	private NodeDouble next;

	public NodeDouble(int value) {
		this.value = value;
		prev = null;
		next = null;
	}

	public void setValue(int newValue) {
		value = newValue;
	}

	public void setPrev(NodeDouble newPrev) {
		prev = newPrev;
	}

	public void setNext(NodeDouble newNext) {
		next = newNext;
	}

	public int getValue() {
		return value;
	}

	public NodeDouble getPrev() {
		return prev;
	}

	public NodeDouble getNext() {
		return next;
	}

	@Override
	public String toString() {
		return value + " ";
	}

}
