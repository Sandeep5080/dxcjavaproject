package collections;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
	ArrayList<Integer> values=new ArrayList<Integer>();
	values.add(10);
	values.add(20);
	values.add(30);
	values.add(40);
	values.add(50);
	Object arr[] = values.toArray();
	
	
	System.out.println("After convert into an array");
	
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}
	}
	}


