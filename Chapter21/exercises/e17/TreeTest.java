package chapter21.exercises.e17;

import java.security.SecureRandom;
import java.util.Scanner;

import chapter21.figures.f17.Tree;

/**
 * Figure 21.18 TreeTest
 * 
 * @author Handan
 */
public class TreeTest {

	public static void main(String[] args) {

		Tree<String> treeString = new Tree<String>();
		Scanner scanner = new Scanner(System.in);
		String inputString = new String();
		inputString = scanner.nextLine();
		String[] arrayString = inputString.split(" ");
		
		
		for(String element: arrayString) {
			treeString.insertNode(element);
		}
		System.out.println();
		System.out.print("PostOrder traversal:  ");
		treeString.postorderTraversal();
		System.out.println();
		System.out.print("PreOrder traversal:  ");
		treeString.preorderTraversal();
		System.out.println();
		System.out.print("InOrder traversal:  ");
		treeString.inorderTraversal();

	}

}
