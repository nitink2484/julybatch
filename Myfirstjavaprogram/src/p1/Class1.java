package p1;

public class Class1 {
	
	int a;
	public void abc()
	{
		System.out.println("Welcome to automation testing");
	}
	
	
	public static void main(String[] args) {
		
		Class1 obj=new Class1();
		obj.abc();
		obj.a=9999;
		System.out.println(obj.a);
		
	}

}
