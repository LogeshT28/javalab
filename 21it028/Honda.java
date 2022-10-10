class bikes
{
		final void run()
		{
			System.out.println("Running");
		}
}
class Honda extends bike
{
	public static void main(String[] args)
	{
		new Honda().run();
	}
}
		