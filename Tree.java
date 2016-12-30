public class Tree{
	Node root1;
	Node root2;

}

// return true if both trees are identical
public boolean identicalTree(Node a, Node b){
	/*check if both trees are empty
	*/
	if(a == null && b == null){
		return true;
	}

	if(a != null && b!= null){
		return (a.data == b.data && identicalTree(a.left,b.left) && identicalTree(a.right, b.right));

		return false;
	}
}