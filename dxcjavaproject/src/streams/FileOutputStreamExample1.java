package streams;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {
	 public static void main(String args[]){    
         try{    
           FileOutputStream fout=new FileOutputStream("C:\\Users\\sreddy370\\OneDrive - DXC Production\\Desktop\\testout.txt"); //    
           fout.write(65);    
           fout.close();    
           System.out.println("success...");    
          }catch(Exception e){System.out.println(e);}    
    }    

}
