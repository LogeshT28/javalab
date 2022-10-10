class grandfather
{
	void showg()
	{
		System.out.println("He is grand father");
	}
}
class father extends grandfather
{
	void showf()
	{
		System.out.println("He is father");
	}
}
class son extends father
{
	void shows()
	{
		System.out.println("He is son");
	}
}
class daughter extends father
{
	void showd()
	{
		System.out.println("she is daughter");
	}
}
public class hybrid
{
	public static void main(String[] args){
		son s=new son();
		s.showg();
		s.showf();
		s.shows();
		
		daughter d = new daughter();
		d.showg();
		d.showf();
		d.shows();
		d.showd();
		
}
}