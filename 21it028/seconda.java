class seconda
{
	int rollno;
	String name;
	static String clgname="Nec";
	static void name(){
		clgname="Nandha";
	}
	static void display(int roll,String n,String clg){
		System.out.println(roll+"\t"+n+"\t"+clg);
	}
	public static void main(String[] args)
	{
		seconda s=new seconda();
		s.rollno=1004;
		s.name="abcd";
		name();
		display(s.rollno,s.name,clgname);
		
		seconda s1=new seconda();
		s1.rollno=1001;
		s1.name="xyzz";
		name();
		display(s1.rollno,s1.name,clgname);
		
		seconda s2=new seconda();
		s2.rollno=2002;
		s2.name="lmnop";
		name();
		display(s2.rollno,s2.name,clgname);
}
}