import java.util.Scanner;

class Pattern6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// your code here
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(i+j+" ");
			}
			System.out.println();
		}

	}
}