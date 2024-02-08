package week1.day4;

public class Methods_Class {
	
	public void sum (int a, int b)
	{
		System.out.println(a+b);
	}
	public int mul(int a, int b)
	{
		int c= a*b;
		return c;
	}

	public static void main(String[] args)
	{
		Methods_Class a= new Methods_Class();
		a.sum(10,20);
		System.out.println(a.mul(10,2));

	}

}
