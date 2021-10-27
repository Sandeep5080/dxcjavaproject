package collections;


import java.util.HashSet;


public class Hashset1 {
	

	
	public static void main(String[] args) {
	
   
     HashSet<Integer> h = new HashSet<Integer>();
     h.add(56);
     h.add(89);
     h.add(80);
     
     h.add(34);
     h.remove(80);
     h.clear();
     System.out.println(h);
     
 }}
