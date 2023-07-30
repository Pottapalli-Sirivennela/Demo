import java.util.Scanner;

class Pattern7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// your code here
		for(int i=1;i<=n;i++)
		{
			int count=1;
			for(int j=1;j<=n;j++)
			{
				count=i*j;
				if(count<10)
				{
					System.out.print("0"+count+" ");
				}
				else
				{
					System.out.print(count+" ");
				}
			}
			System.out.println();
		}

	}
}