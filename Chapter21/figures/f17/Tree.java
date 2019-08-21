package chapter21.figures.f17;

 class TreeNode<T extends Comparable<T>> {

	TreeNode<T> leftNode;
	T data;
	TreeNode<T> rightNode;

	public TreeNode(T NodeData) {
		data = NodeData;
		leftNode = rightNode = null;
	}

	public void Inser(T insertvalue) {
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

	private void Insert(T insertvalue) {
		// TODO Auto-generated method stub
		
	}
}
 public class Tree<T extends Comparable<T>>{
	 private TreeNode<T> root;
	 
	public Tree(){
		root = null;
	 }
	
	
	
 }