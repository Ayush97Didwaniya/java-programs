class demostatic1
{
    static int a=10;/*only static member is called by static method
	but static method can have its own nonstatic member 
	*/
	public static void main(String args[])
	{
	System.out.println("before"+a);
	a=-1;
	System.out.println("after"+a);
	}
}	