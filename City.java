package practice;

public class City {
	
	
	void area()
	{
		System.out.println("area");
	}
	

	void area(int a)
	{
		System.out.println("area a");
	}
	
	void area (String b)
	{
		System.out.println("area b");
	}
	
	static void area(int d, double c)
	{
		System.out.println("area d and c ");
	}
	
	public static void main(String[] args) {
		area(6, 7.1);
		
		// created object for non static methods
		City c1 = new City();
		c1.area();
		c1.area(3);
		c1.area("kuvempunagar");
			
			
	}	

}
