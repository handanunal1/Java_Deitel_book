package chapter21.exercises.e23;

/**
 * Figure 21.18 TreeTest
 * 
 * @author Handan
 */
public class TreeTest {

	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();

		for (int i = 0; i <= 10; i++) {
			int value = i;
			System.out.println("value " + value);
			tree.insertNode(value);
		}
		System.out.print("Preorder data ");
		tree.preorderTraversal();
	
		TreeNode<Integer> node = tree.getRoot();
		Integer data =9;
		tree.postorderHelper(node, data,0);

	}

}
