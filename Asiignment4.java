package mypackage;

public class Asiignment4 {
	public static void main(String[] args) {
	
		//calling static methods 
		bengaluru();
	  chennai();
	  hyderabad();
	  mumbai();
	  kolkatta();
	  
	  // calling non static methods 
	  
	  Asiignment4 a4 = new Asiignment4();
	  a4.car();
	  a4.Bus();
	  a4.train();
	  a4.airbus();
	  a4.ship();
          
		
		
		
	}

	void car()
	{
		System.out.println("this is a car");
	}
	
	void Bus()
	{
		System.out.println("this is a bus");	
	}
	
	void train()
	
	{
		System.out.println("this is a train");
	}
	
	void airbus()
	{
		System.out.println("this is a airbus");
	}
	
	void ship()
	{
		System.out.println("this is a ship");
	}
	
   static void bengaluru()
   {
	   System.out.println("welcome to bengaluru");
   }
   
   static void chennai()
   {
	   System.out.println("welcome to chennai");
   }
	
   static void hyderabad()
   {
	   System.out.println("welcome to hyderabad");
   }
	
   static void mumbai()
   {
	   System.out.println("welcome to mumbai");
   }
   static void kolkatta()
   {
	   System.out.println("welcome to kolkatta");
   }
}
