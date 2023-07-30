import java.util.Scanner;

class Pattern9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// Write your code here
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				{
					System.out.print("*"+" ");
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