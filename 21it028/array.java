class array
{
	public static void main(String[] args)
	{
		int a1[] = new int [5];
		a1[0] = 12;
		a1[1] = 13;
		a1[2] = 24;
		a1[3] = 56;
		a1[4] = 89;


	for(int i=0;i<5;i++)
	{
		System.out.println(a1[i]);
	}
System.out.println("   ");
	
	int a2[][] = new int[3][2];
	a2[0][0] = 32;
	a2[0][1] = 87;
	a2[1][0] = 65;
	a2[1][1] = 90;
	a2[2][0] = 76;
	a2[2][1] = 54;
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
			{
				System.out.println(a2[i][j]);
			}
	}
	}
}
