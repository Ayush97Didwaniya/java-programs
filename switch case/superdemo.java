class A
{
  void show()
  {
  System.out.println("hi");
  }
}
class B extends A
{
   void show()
   {
   super.show();
   System.out.println("bye");
   }
}
class superdemo
{
   static public void main(String[] arr)
   {
   B ob=new B();
   ob.show();
   }
}  