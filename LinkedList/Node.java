/*This class stores student details in a list*/
public class Node{
	private String name;
	private String matNumber;
	private int year;
	private Node next;



	public Node(String n, String m, int y){
		this.name = n;
		this.matNumber = m;
		this.year = y;

	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setMatNumber(String m){
		matNumber = m;
	}

	public String getMatNumber(){
		return matNumber;
	}

	public void setYear(int y){
         year =y;
	}

	public int getYear(){
		return year;
	}

public void setNode(Node n){
	next = n;
}
	public Node getNextNode(){
		return next;
	}
}