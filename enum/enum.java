public enum Day
{
SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class Enumtest
{
Day day;
public Enumtest(Day day)
{
this.day=day;
}
public void tell()
{
switch(day)
{
    case MONDAY:
	     System.out.println("monday are bad");
		 break;
	case FRIDAY:
         System.out.println("friday are better");
         break;
    default:
	System.out.println("midways days are soso");
	break;
	}
}
	public static void main(String[] args)
	{
	EnumTest firstDay=new Enumtest(Day.MONDAY);
	firstDay.tell();
	}
}