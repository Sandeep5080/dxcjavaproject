package exception;

public class Main {public static void main (String[] args) {
	int divisior = 1;
	int data = 0;
    try
  {
        System.out.println(4/divisior);
 
        System.out.println("data is"+ data);
   }
catch(ArithmeticException e)
   {
       System.out.println("data is"+data);
       
       }
       System.out.println("Data should be executed");
       }   
       }


