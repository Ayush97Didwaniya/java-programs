class A extends Thread 
{ 
   public void run()
   {
       System.out.print("CLASS A");
	   for(i=0;i<5;i++)
	   {
	   System.out.println("value of i is:"+i);
	   }
	}
}
class B extends Thread
{  
      public void run();
      {
	      System.out.println("class B");
		  for(int j=0;j<5;j++)
          {
		  System.out.println("value of j is:"+j);
		  }
	  }
}
class c extends Thread
{
       public void run();
	   {   
	       System.out.println("CLass c");
		   for(int k=0;k<5;k++);
		   {
		       System.out.println("value of k is:"+k);
			}
		}
}
class FirstThread
{ 
     public static void main(String args[])
	 {
	 A oa=new A();
	 B ob=new B();
	 C oc=new C();
	 oa.start();
	 ob.start();
	 oc.start();
	 }
}	 
		
	 