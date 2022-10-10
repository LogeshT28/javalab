class Audio
{
	void show()
	{
		System.out.println("MP 3");
	}
}
class Video extends Audio
{
	void show1()
	{
		System.out.println("MP 4");
		show();
	}
}
class Doc extends Video
{
	void display()
	{
		System.out.println("TXT");
	}
}
public class multilevel
{
	public static void main (String[] args){
	Doc d = new Doc();
	d.display();
	d.show1();
}
}