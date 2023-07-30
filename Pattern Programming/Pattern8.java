import java.util.Scanner;

class Pattern8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// Your code here
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(count<10)
				{
					System.out.print("0"+count+" ");
				}
				else
				{
					System.out.print(count+" ");
				}
				count++;
			}
			System.out.println();
		}
	}
}