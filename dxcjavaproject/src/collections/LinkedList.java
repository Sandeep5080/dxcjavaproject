package collections;

import java.util.Iterator;

public class LinkedList {
	Node head;
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
				
			}
			n.next = node;
		}
	}
  public void show()
  {
	  Node node = head;
	  while(node.next!=null)
	  {
		  System.out.println(node.data);
		  node = node.next;
	  }
	  System.out.println(node.data);
  }
public void add(String string) {
	// TODO Auto-generated method stub
	
}
public void add(int i, int x) {
	// TODO Auto-generated method stub
	
}
public void remove(int y) {
	// TODO Auto-generated method stub
	
}
public Iterator<Integer> iterator() {
	// TODO Auto-generated method stub
	return null;
}
}
