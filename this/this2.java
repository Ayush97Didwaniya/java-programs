class room 
{
    private int length,breadth,height;
	room(int l,int b,int h)
	{
	this.length=l;
	this.breadth=b;
	this.height=h;
	}
	room(int l,int b)
	{
	this(1,b,l);
	}
	room(int l)
	{
	this(l,0,0);
	}
	room()
	{
	this(0,0,0);
	}
	void show()
	{
	System.out.println("length is "+this.length);
	System.out.println("breadth is "+this.breadth);
	System.out.println("height is "+this.height);
	}
}
class this2	
{ 
public static void main(String args[])
{
room r1=new room(10,20,30);
System.out.println("Dimension of room r1 are");
r1.show();
room r2=new room(23,43);
System.out.println("Dimension of room r1 are");
r2.show();
}
}
