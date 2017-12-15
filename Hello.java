public class Hello
{
	public static void main(String[] args)
	{
		System.out.println(" vs code is awesome ");
		
		greet("Git");
	}
	
	public static void greet(String name)
	{
		System.out.println(" Bye bye " + name);
	}
	
	public static void add( int x, int y )
	{
		return x+y;
	}
	
	public static void multiply(int x, int y)
	{
		int ret = 0;
		for (int i = 1; i <= y; i++)
		{
			ret = add(ret, x);
		}
		
		return ret;
	}
	
	public static multiply(int x, int y)
	{
		return x*y;
	}
}
