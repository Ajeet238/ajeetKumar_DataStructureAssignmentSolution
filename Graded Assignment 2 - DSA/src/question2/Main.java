package question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BstToSkew tree = new BstToSkew();
		
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
	       
	        int order = 0;
	       tree.binaryToSkewed(tree.node, order);
	       tree.travelRightSkew(tree.headNode);

	}

}
