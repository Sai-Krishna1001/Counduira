class Krishna implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("krishna");
	}
}
public class YourThread
{
	public static void main(String[] args)
	{
		new Thread(new Krishna()).start();
	}
}