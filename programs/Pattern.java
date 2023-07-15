class Pattern
{
	public static void main(String[] args)
	{
		int n=5;
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
				system.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(j==i || i== n || j==0)
				{
					System.out.println("* ");
				}
				else
				{
					Ststem.out.println(" ");
				}	
			}
		}
	}
}