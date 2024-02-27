package mypackage;

public class Assignment4 {
	
	//static method
	static void add()
	{
		int a = 10;
		int b= 20;
		int sum = a+b;
		System.out.println(sum);
		
	}
	//non static method 
	void substract()
	{
		int a = 10;
		int b= 20;
		int sub= b-a;
		System.out.println(sub);
	}
	
	//constructor 
	Assignment4()
	{
		System.out.println("i'm the constructor");
	}
	
	
	
public static void main(String[] args) {
	// calling static method
	add(); 
	//creating object to call non static method
	Assignment4 a1 = new Assignment4();
	
	// calling non static method
	a1.substract();
	
		
}
}
