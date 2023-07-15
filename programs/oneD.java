import java.util.Scanner;
class oneD
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Student age is:");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
