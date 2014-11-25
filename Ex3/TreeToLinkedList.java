public class TreeToLinkedList {
	

	public TreeNode treeToLL(TreeNode root) {
		TreeNode head = root;

		while(head.left() != null) {
			head = head.left();
		}

		treeToLL(root, null);
		return head;
	}

	private void treeToLL(TreeNode node, TreeNode prev) {

		if (node != null) {
			System.out.println("NODE: " + node.left() + " " + node + " " + node.right());
			if (prev != null) {
				System.out.println("PREV: " + prev.left() + " " + prev + " " + prev.right());	
			}
			

			//prev = node;
			treeToLL(node.left(), node);
			//System.out.print(node);
			//System.out.println(prev);
			node.left(prev);
			if (prev != null) {
				System.out.println("in here");
				prev.right(node);
			}
			//prev = node;
			treeToLL(node.right(), node);
		}
	}



}
