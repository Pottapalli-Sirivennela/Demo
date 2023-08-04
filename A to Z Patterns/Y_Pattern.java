import java.util.Scanner;
class Y
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(((i<=(n/2)+1) && (i==j)) || ((j>=(n/2)+1) && (i+j==n+1)) || (i>=(n/2)+1 && j==(n/2)+1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}