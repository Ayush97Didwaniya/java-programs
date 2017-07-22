class DemoSwitch1
{
       public static void main(String args[])throws Exception
	   {
	   System.out.println("Enter your choice:");
	   System.out.println("a:airline,b:bus,c:cab,t:train,s:ship");
	   char ch=(char)System.in.read();
	   System.out.println("---------------");
	   System.out.println("your choice");
	   switch(ch)
	       {
	       case 'a':
	       case 'A':
                   System.out.println("airline reservation");
	               break;
	       case 'b':
	       case 'B':
	               System.out.println("bus reservation");
				   break;
	       case 'C':
	       case 'c':
	               System.out.println("car reservation");
				   break;
           case 't':
	       case 'T':
	               System.out.println("train reservation");
				   break;
	       case 's':
	       case 'S':
	               System.out.println("ship reservation");
				   break;
	       default:
	               System.out.println("no case is define for this input");
	       }
		}
}