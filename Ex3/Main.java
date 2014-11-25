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
		/*
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
		*/

		// 3-20
		/*
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);

		Node nn1 = new Node(1);
		Node nn2 = new Node(2);
		Node nn3 = new Node(3);
		Node nn4 = new Node(4);
		Node nn5 = new Node(5);
		nn1.setNext(nn2);
		nn2.setNext(nn3);
		nn3.setNext(nn4);
		nn4.setNext(nn5);

		MiddleNode mid = new MiddleNode();

		System.out.println(mid.middleNode(n1));
		System.out.println(mid.middleNode(nn1));
		System.out.println(mid.middleNode(null));
		*/

		// 3-21
		/*
		TreeNode one4 = new TreeNode(2);
		TreeNode one5 = new TreeNode(1);
		TreeNode one2 = new TreeNode(4, one4, null);
		TreeNode one3 = new TreeNode(3, one5, null);
		TreeNode one1 = new TreeNode(5, one2, one3);

		TreeNode two4 = new TreeNode(2);
		TreeNode two5 = new TreeNode(1);
		TreeNode two2 = new TreeNode(4, two4, null);
		TreeNode two3 = new TreeNode(3, two5, new TreeNode(4));
		TreeNode two1 = new TreeNode(5, two2, two3);

		EqualTrees et = new EqualTrees();
		System.out.println(et.equal(one1, two1));
		*/

		//3-22
		TreeNode two2 = new TreeNode(8, new TreeNode(5), null);
		TreeNode two3 = new TreeNode(15, new TreeNode(11), null);
		TreeNode two1 = new TreeNode(10, two2, two3);
		TreeToLinkedList treeToLL = new TreeToLinkedList();
		printTLL(treeToLL.treeToLL(two1));

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

	private static void printTLL(TreeNode head) {
		if (head == null) {
			System.out.println("Empty List");
			return;
		}
		TreeNode curr = head;

		while (curr != null) {
			System.out.print(curr.getValue() + " ");
			curr = curr.right();
		}
		System.out.println();
	}

}
