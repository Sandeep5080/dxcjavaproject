package thread;
class hi
{
	public void show()
	{
		Thread t1 = new Thread();
		{
		for(int i=1;i<=5;i++)
		{
			t1.start();
		System.out.println("hi");
		try { Thread.sleep(500); } catch(Exception e) {}
		
	}
}}}

	class hello
	{
	public void show()
	{
		Thread t2 = new Thread();
		{
		for(int i=1;i<=5;i++)
		{
			t2.start();
		System.out.println("hello");
		try { Thread.sleep(1500); } catch(Exception e) {}
		
		
	
	
	
	}
	}
	}
	}
	
public class ThreadDemo {
	public static void main(String args[]) {
		hi Obj1 = new hi();
		hello Obj2 = new hello();
		
		Obj1.show();
		Obj2.show();
		
		
		
	}}


