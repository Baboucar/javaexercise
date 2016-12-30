import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ArrayListintro{
	public static void main(String[] args) {
		ArrayList<String> phrases = new ArrayList<>();
		 phrases.add("Hello");
		 phrases.add("How are you");

		 List<Integer> numbers = new ArrayList<>();
		  numbers.add(5);
		  numbers.add(10);
		  numbers.add(20);

		 /* for(int i = 0; i < phrases.size(); i++){
		  	System.out.println(phrases.get(i));
		  }*/
		  /*iterate through an array using the iterator class*/

		  Iterator ite = phrases.iterator();
		  while(ite.hasNext()){
		  	String str = (String)ite.next();
		  	System.out.println(str);
		  }
	}

}