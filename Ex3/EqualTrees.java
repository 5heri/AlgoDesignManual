public class EqualTrees {
	
	public boolean equal(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) return true;

		if (t1 != null && t2 != null) {
			return t1.getValue() == t2.getValue() 
				&& equal(t1.left(), t2.left()) 
				&& equal(t1.right(), t2.right());
		}

		return false;
	}
}
