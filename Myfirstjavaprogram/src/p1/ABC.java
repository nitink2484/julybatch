package p1;

public class ABC {
	
	public ABC(int a, int b) 
	
	{
		System.out.println("this is 2 parameterized constructor");
	}
	
     public ABC(int a) 
	
	{
		System.out.println("this is 1 parameterized constructor");
	}
     
     public ABC() 
 	
 	{
 		System.out.println("this is default constructor");
 	}

     
     public static void main(String[] args) {
		
    	 ABC obj=new ABC(99, 8);
    	 
    	 
	}
}
