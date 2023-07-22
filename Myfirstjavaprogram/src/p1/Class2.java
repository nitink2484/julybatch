package p1;

public class Class2 {
	
	
	public int sum(int a, int b)
	{
		int c=a+b;
		
		System.out.println("the sum is " +c);
		return c;
	}
	
	public int sub(int x, int y)
	{
		int z=x-y;
		System.out.println("The sub is " +z);
		return z;
	}

	
	public int mul(int a1, int b1)
	{
		int c1=a1*b1;
		System.out.println("The multiply result " +c1);
		return c1;
		
	}
	
	public void div(int x1, int y1)
	{   int z1= x1/y1;
		System.out.println("The final result is " +z1);
	}
	
	
	public static void main(String[] args) {
		
		Class2 obj=new Class2();
		int sum_result=obj.sum(10, 2);
		int sum_result2=obj.sum(sum_result, 2);
		int sub_result=obj.sub(sum_result2, 2);
		int mul_result=obj.mul(sub_result, 2);
		obj.div(mul_result, 2);
		
	}
}
