class second
{
	int rollno;
	String name;
	second(int roll,String n){
	this.rollno=roll;
	this.name=n;
	}
	void display()
	{
		System.out.println(rollno+"\n"+name);
	}
	public static void main(String[] args)
	{
		second s=new second(28,"xxyyzz");
		s.display();
	}
}