class thisl
{
	int rollno;
	String name;
	thisl(int roll,String n){
	this.rollno=roll;
	this.name=n;
	}
	void display()
	{
		System.out.println(rollno+"\t"+name);
	}
	public static void main(String[] args)
	{
		thisl s=new thisl(1,"xxyyzz");
		s.display();
	}
}