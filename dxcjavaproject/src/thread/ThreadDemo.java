package thread;
class hi
{
	public void show()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("hi");
		try { Thread.sleep(500); } catch(Exception e) {}
		
	}
}}

	class hello
	{
	public void show()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("hello");
		try { Thread.sleep(1500); } catch(Exception e) {}
		
	
	
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


