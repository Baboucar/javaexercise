/*this class will create the linklist functionality*/
public class List{
	private Node head;


	public void setHead(Node h){
		head = h;
	}

	public Node getHead(){
	return head;
	}
/*Add a new item to the list*/

public void addNewItem(Node newNode){
	if(head == null){
		head = newNode;
	}
	else{
		newNode.setNextNode(head);
		head= addNewItem;
	}
}


public Node find(String name){
	Node first = head;
	while(head != null){
		if(head.getName.equals(name)){
			reaturn first;
		}
		first = first.getNext();
	}

}
}