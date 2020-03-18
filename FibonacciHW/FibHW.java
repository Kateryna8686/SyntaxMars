package FibonacciHW;

public class FibHW {
	
	public static void main(String []args)  
	{
	 // Set it to the number of elements you want in the Fibonacci Series	
	 int n1=0;
	 int n2=1;
	 int a=10;
	 int n3;
 
     System.out.print(n1+" "+n2);//printing 0 and 1    
   
     for(int i=2;i<a;i++)//loop starts from 2 because 0 and 1 are already printed    
     {    
       	 
	  n3=n1+n2;    
	  System.out.print(" "+n3);
	  n1=n2;    
	  n2=n3;   
	  /* For Loop iterates through a
         Calculates n3 of n1 and n2
         Updates new values of n1 and n2
      */	  
	 }      
	}}


