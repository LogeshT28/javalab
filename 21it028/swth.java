import java.util.Scanner;
class swth
{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the Alphapet:");
		char s = c.next().charAt(0);
		
		switch(s)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
			
			System.out.println("vowels");
			break;
			default:
			System.out.println("not a vowel");
			break;
		}
	}
}