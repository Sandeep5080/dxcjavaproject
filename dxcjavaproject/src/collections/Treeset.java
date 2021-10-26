package collections;
import java.util.*;

public class Treeset {


	public static void main(String[] args) {
		
	
	
		TreeSet <String> animal=new TreeSet<String>();
		animal.add("Dog");
		animal.add("Tiger");
		animal.add("Lion");
		

		

		System.out.println(animal.descendingSet());

		System.out.println(animal.pollFirst());


		System.out.println(animal.tailSet("Fox"));
	}

}




