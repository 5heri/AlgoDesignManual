public class ReverseLinkedLists {
	

	public Node reverseSLL(Node head) {
		
		Node prev = null;
		Node next = null;
		Node curr = head;

		while (curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public NodeDouble reverseDLL(NodeDouble head) {

		NodeDouble prev = null;
		NodeDouble curr = head;

		while (curr != null) {
			//prev = curr.getPrev();
			curr.setPrev(curr.getNext());
			curr.setNext(prev);
			prev = curr;
			curr = curr.getPrev();
		}
		return prev;
	}
}
