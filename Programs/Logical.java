class Logical 
{
	public static void main (String []args)
	{
		boolean a = true;
		boolean b = false;
		System.out.println("AND Result : "+(true&&true));
		System.out.println("AND Result : "+(true&&false));
		System.out.println("OR Result : "+(true||false));
		System.out.println("OR Result : "+(false||false));
		System.out.println("ANd Result : "+(a&&b));
		System.out.println("OR Result : "+(b||a));
	}
}