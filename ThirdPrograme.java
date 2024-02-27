package mypackage;

public class ThirdPrograme {
	
	public static void main(String[] args) {
		addition();
		substarction();
		Multiply();
		division();
}
	
	static void addition()
	{
		int a=10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}

	static void substarction()
	{
		int a=10;
		int b = 20;
		int sub = a-b;
		System.out.println(sub);
	}
	
	static void Multiply()
	{
		int a = 10;
		int b = 20;
		int multiply = a*b;
		System.out.println(multiply);
	}
	
	static void division()
	{
		int a = 10;
		int b= 20;
		int division = a/b;
		System.out.println(division);
		}
}
