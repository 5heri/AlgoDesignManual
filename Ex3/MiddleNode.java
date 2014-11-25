public class MiddleNode {
	

	public Node middleNode(Node head) {
		// if (head == null) return null;

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.getNext() != null 
			/*&& fast.getNext().getNext() != null*/) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}

		return slow;
	}
}
