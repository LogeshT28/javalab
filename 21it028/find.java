import java.util.Scanner;
class find
{
	public static void main(String[] args)
	{
		int array[] = new int [5];
		array[0] = 23;
		array[1] = 56;
		array[3] = 43;
		array[4] = 65;
		array[2] = 87;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the finding number:");
		int f=s.nextInt();
		int w=0;
		for(int i=0;i<5;i++)
		{
			if(array[i]==f)
			{
				w=1;
				break;
			}
			else
			{
				w=0;
			}
		}
		if(w==0)
		{
			System.out.println("false");

		}
		else
		{
			System.out.println("true");
		}
}
}