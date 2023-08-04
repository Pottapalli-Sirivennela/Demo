import java.util.Scanner;
class C
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==n)
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