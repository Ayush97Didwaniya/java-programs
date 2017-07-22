class demo 
{
    void show()
	{
	  class a
	  {
	    void call()
	    {
		System.out.println("call function call");
		}
	  }
	  a oa=new a();
	  oa.call();
	}
}
class demolocal
{
    public static void main(String args[])
	{
	demo b=new demo();
	b.show();
	}
}	
	
	
	 
		