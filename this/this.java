class room
{ 
	  int length,height;
	  room(int length,int height)
      {
	  this.length=length;
	  this.height=height;
	  }
	  void area()
	  {
	  System.out.println("area is"+(length*height));
	  }
	  }
class this1
{
      public static void main(String args[])
	  {
	  room r=new room(100,200);
	  r.area();
	  }
}
	  
	  
