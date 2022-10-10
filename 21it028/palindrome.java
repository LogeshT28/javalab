class palindrome
{
	public static void main(String[] args)
{
		
		String s="malayalam";
		String rev="";

		int l =s.length();
		for(int i=l-1;i>=0;i--)
		{
			rev =rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println(s+" is a palindrome");
		}
		else
		{
			System.out.println(s+" is not a palintrome");
		}
}
}