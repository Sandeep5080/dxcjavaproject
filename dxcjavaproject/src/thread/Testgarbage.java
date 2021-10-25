package thread;

public class Testgarbage {
	 
		 public void finalize(){System.out.println("object is garbage collected");}  
		 public static void main(String args[]){  
		  Testgarbage s1=new Testgarbage();  
		  Testgarbage s2=new Testgarbage();  
		  s1=null;  
		  s2=null;  
		  System.gc();  
		 }  
		}  


