package thread;


	class TestJoin extends Thread{  
		 public void run(){  
		  System.out.println(Thread.currentThread().getName());  
		 }  
		  
		 public static void main(String[] args){  
		  TestJoin t1=new TestJoin();  
		  TestJoin t2=new TestJoin();  
		  
		  t1.start();  
		  t2.start();  
		 }  
		}  
		
	


