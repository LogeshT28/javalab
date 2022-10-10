class  Day1
{
	void details()
	{
		System.out.println("Monday");
	}
}
class Day2 extends Day1
{
	void display()
	{
		System.out.println("Tuesday");
	}
}
public class Week
{
	public static void main(String[] args)
	{
		Day2 d=new Day2();
		d.details();
		d.display();
	}
}