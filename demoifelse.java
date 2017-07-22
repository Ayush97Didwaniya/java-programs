class demoifelse
{
     public static void main(String args[])
     {
        int a=(int)(Math.random()*100);
		int b=(int)(Math.random()*100);
		int c=(int)(Math.random()*100);
		System.out.print(a+","+b+","+c);
		if(a>b)
		{
	     	if(a>c)
		    System.out.println("a is greater"+a);
		    else 
		    System.out.println("c is greatest"+c);
		}
		else 
		{
	        if(b>c)
			System.out.print("b is greatest "+b);
			else 
			System.out.println("c is greatest "+c);
        }
	System.out.println("end of program");
    } 
}
       
        	  
			