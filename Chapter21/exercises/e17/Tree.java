package chapter21.exercises.e17;
/**
 * Figure 21.17   TreeNode / Tree
 *  @author Handan
 */
class TreeNode<T extends Comparable<T>> {

	TreeNode<T> leftNode;
	T data;
	TreeNode<T> rightNode;

	public TreeNode(T NodeData) {
		data = NodeData;
		leftNode = rightNode = null;
	}

	public void Insert(T insertvalue) {
		if (insertvalue.compareTo(data) < 0) {
			if (leftNode == null)
				leftNode = new TreeNode<T>(insertvalue);
			else
				leftNode.Insert(insertvalue);

		} else if (insertvalue.compareTo(data) > 0) {
			if (rightNode == null)
				rightNode = new TreeNode<T>(insertvalue);
			else
				rightNode.Insert(insertvalue);

		}
	}

}

public class Tree<T extends Comparable<T>> {
	private TreeNode<T> root;

	public Tree() {
		root = null;
	}

	public void insertNode(T insertValue) {
		if (root == null) {
			root = new TreeNode<T>(insertValue);
		} else {
			root.Insert(insertValue);
		}
	}

	public void preorderTraversal() {
		preorderHelper(root);
	}

	private void preorderHelper(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data+ " ");
		preorderHelper(node.leftNode);
		preorderHelper(node.rightNode);

	}

	public void inorderTraversal() {
		inorderHelper(root);
	}

	private void inorderHelper(TreeNode<T> node) {
		if (node == null) {
			return;
		}

		inorderHelper(node.leftNode);
		System.out.print(node.data+ " ");
		inorderHelper(node.rightNode);

	}

	public void postorderTraversal() {
		postorderHelper(root);
	}

	private void postorderHelper(TreeNode<T> node) {
		if (node == null) {
			return;
		}

		postorderHelper(node.leftNode);
		postorderHelper(node.rightNode);
		System.out.print(node.data+ " ");

	}
}