package streams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class DataStream {
	public static void main(String args[])throws Exception{    
	      FileOutputStream fout1=new FileOutputStream("C:\\Users\\sreddy370\\OneDrive - DXC Production\\Desktop\\f1.in");    
	      FileOutputStream fout2=new FileOutputStream("C:\\Users\\sreddy370\\OneDrive - DXC Production\\Desktop\\f2.out");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");    
	     }    

}
