package chapter21.figures.f18;

import java.security.SecureRandom;
import chapter21.figures.f17.Tree;

/**
 * Figure 21.18 TreeTest
 * 
 * @author Handan
 */
public class TreeTest {

	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();
		SecureRandom randomNumber = new SecureRandom();
		System.out.println("Insert the following values");

		for (int i = 0; i <= 10; i++) {
			int value = randomNumber.nextInt(100);
			System.out.println("value " + value);
			tree.insertNode(value);
		}
      System.out.print("Preorder data ");
		tree.preorderTraversal();
	      System.out.print("\nInOrder data ");
		tree.inorderTraversal();
		  System.out.print("\nPostorder data ");
		tree.postorderTraversal();

	}

}
