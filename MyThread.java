class Krishna extends Thread
{
	@Override
	public void run()
	{
		System.out.println("krishna");
	}
}
public class MyThread
{
	public static void main(String[] args)
	{
		Krishna t = new Krishna();
		t.start();
	}
}