import java.util.Scanner;
class R
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-1;j++)
			{
				if(i==1 || j==1 || i==(n/2) || (j==n-1 && i<=(n/2)) || (i>=(n/2)+1 && j>=(n-1)/2 && i-1==j))
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