class DemoSwitch123
{                                                                   
      public static void main(String args[])
	  {  
	      System.out.println("enter your choice");
		  System.out.println("airline,bus,car,train,ship");
		  java.util.Scanner obj=new java.util.Scanner(System.in);
		  String value=obj.next();
		  System.out.println("-------------");
		  System.out.println("your choice is:"+value);
		    switch(value)
		    { 
	            case"airline":
                System.out.println("airline reservation");
                break;
                case"car":	
                System.out.println("car reservation");
                break;
            	case"bus":			
		        System.out.println("bus reservation");
	            break;	
         		case"train":
				System.out.println("train reservation");
				break;
				case"ship":
				System.out.println("ship reservation");
				break;
				default:
				System.out.println("no case is define for this name");
			}
	}	
}	
