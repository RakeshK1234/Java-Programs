package practice;

public class IfOrderOfExcecution {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b)
		{
			System.out.println("print a");
		}
		
		if(b>c)
		{
			System.out.println("print b");
		}
		
		if (c>a)
		{
			System.out.println("print c");
		}
		
		if(a<b)

		{
			System.out.println("print a");
		}
		if (b<=c)
		{
			System.out.println("print c");
		}
	}

}