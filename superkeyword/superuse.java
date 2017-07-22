class A
{
   int a=50;
}
class B extends A
{
int a=100;
void show()
{
System.out.println(super.a);
System.out.println(a);
}
}
class superuse
{
     public static void main(String[] arr)
   {
	 B ob=new B();
	 ob.show();
   }	 
}  