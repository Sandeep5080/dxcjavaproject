package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Sandeep");
		names.add("Reddy");

		
		System.out.println(names);
		

		Iterator itr=names.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}