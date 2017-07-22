import java.applet.Applet;

public class Firstprogram extends Applet
{
public void init()
  {
	System.out.println("applet initialized");
  }
public void start()
{
	System.out.print("applet started ");
}
public void stop()
{ System.out.println("applet stopped");
}
public void destroy()
{
	System.out.println("applet destroyed");
}
}
