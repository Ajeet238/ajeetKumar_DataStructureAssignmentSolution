package question2;

public class BstToSkew {
	 public Node node;
	    Node prevNode = null;
	    Node headNode = null;
	   
	   
		void binaryToSkewed(Node root, int order) {

			if (root == null) {
				return;
			}

			if (order > 0) {
				binaryToSkewed(root.right, order);
			} else {
				binaryToSkewed(root.left, order);
			}
			Node rightNode = root.right;
			Node leftNode = root.left;

			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			} else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}

			if (order > 0) {
				binaryToSkewed(leftNode, order);
			} else {
				binaryToSkewed(rightNode, order);
			}
		}
	   
	    void travelRightSkew(Node root)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.val + " ");
	        travelRightSkew(root.right);       
	    }
}
