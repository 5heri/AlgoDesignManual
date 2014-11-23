public class Main {
	

	public static void main(String[] args) {

		// 3-1
		/*
		ParenthesesCheck p = new ParenthesesCheck();
		System.out.println(p.isCorrect("((())())()"));
		System.out.println(p.isCorrect(")()("));
		System.out.println(p.isCorrect("())"));

		System.out.println(p.getIndexOfIncorrect("((())())()"));
		System.out.println(p.getIndexOfIncorrect(")()("));
		System.out.println(p.getIndexOfIncorrect("())"));
		*/

		//3-2
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);

		NodeDouble nd1 = new NodeDouble(1);
		NodeDouble nd2 = new NodeDouble(2);
		NodeDouble nd3 = new NodeDouble(3);
		NodeDouble nd4 = new NodeDouble(4);
		nd1.setNext(nd2);
		nd2.setPrev(nd1);
		nd2.setNext(nd3);
		nd3.setPrev(nd2);
		nd3.setNext(nd4);
		nd4.setPrev(nd3);

		ReverseLinkedLists reverser = new ReverseLinkedLists();

		Node sH = reverser.reverseSLL(n1);
		NodeDouble dH = reverser.reverseDLL(nd1);

		printSLL(sH);
		printDLL(dH);

		printSLL(reverser.reverseSLL(null));
		printDLL(reverser.reverseDLL(null));

	}

	private static void printSLL(Node head) {
		if (head == null) {
			System.out.println("Empty List");
			return;
		}
		Node curr = head;

		while (curr != null) {
			System.out.print(curr);
			curr = curr.getNext();
		}
		System.out.println();
	}

	private static void printDLL(NodeDouble head) {
		if (head == null) {
			System.out.println("Empty List");
			return;
		}
		NodeDouble curr = head;

		while (curr != null) {
			System.out.print(curr);
			curr = curr.getNext();
		}
		System.out.println();
	}

	private static void printDLLProper(NodeDouble head) {
		NodeDouble curr
	}
}
