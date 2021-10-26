package collections;
import java.util.*;  

public class ArrayListExample2 {
	
	
	 public static void main(String args[]){  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Mango");  
	  al.add("apple");  
	  al.add("Banana");  
	  al.add("Grapes"); 
	  Collections.sort(al);  
	     
	  
	  for(String fruit:al)    
	    System.out.println(fruit);    
	  
	 }  


}