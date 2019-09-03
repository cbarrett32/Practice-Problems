import java.util.Arrays;

public class TreeMain {

	public static void main(String[] args) {
		int[] sArray = {3, 5, 6, 8, 10, 11, 12};
		
		TreeNode answer = minTree(sArray);
		traversal(answer, 0);
	}
	
	public static TreeNode minTree (int[] sArray) {
		int medianLocation = sArray.length/2;
		int	medianValue = sArray[medianLocation];
		if(sArray.length==1) {
			TreeNode leaf = new TreeNode(medianValue, null);
			return leaf;
		}
		else if(sArray.length==2) {
			int[] leftSide = {sArray[0]};
			TreeNode[] children = {minTree(leftSide), null};
			TreeNode root = new TreeNode(medianValue, children);
			return root;
		}
		else {
			int[] leftSide = Arrays.copyOfRange(sArray, 0, medianLocation);
			int[] rightSide = Arrays.copyOfRange(sArray, medianLocation+1, sArray.length);

			TreeNode[] children = {minTree(leftSide), minTree(rightSide)};			
			TreeNode root = new TreeNode(medianValue, children);
			return root;
		}
	}
	
	public static void traversal(TreeNode answer, int level) {
		level++;
		if(answer!=null) {
			if(answer.children!=null) {
				traversal(answer.children[0], level);
				System.out.println("Value: " + answer.value + " at level: " + level);
				traversal(answer.children[1], level);
			}
			else 
				System.out.println("Value: " + answer.value + " at level: " + level);

		}
	}

}
