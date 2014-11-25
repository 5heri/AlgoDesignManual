public class TreeNode {
	

	private int value;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void left(TreeNode left) {
		this.left = left;
	}

	public void right(TreeNode right) {
		this.right = right;
	}

	public TreeNode left() {
		return left;
	}

	public TreeNode right() {
		return right;
	}

	@Override
	public String toString() {
		return value + " ";
	}
}
