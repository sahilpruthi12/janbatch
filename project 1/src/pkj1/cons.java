package pkj1;

public class cons 
{
	public void m1()
	{
	 this.m5();
		System.out.println("default parameterized method");	
	}
	public void m2()
	{
		this.m1();
		System.out.println("one parameterized method");
	}
	public void m3()
	{
		this.m4();
		System.out.println("two parameterized method");
	}
	public void m4()
	{
		this.m2();
		System.out.println("three parameterized method");
	}
	public void m5()
	{
		System.out.println("four parametrized method");
	}
	public static void main(String[] args) 
	{
	cons obj= new cons();
	obj.m3();
	}
}
