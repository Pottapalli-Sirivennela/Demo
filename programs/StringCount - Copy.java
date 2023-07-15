import java.util.Scanner;
class Spacecount
{
	int spaceCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		return count;
	}
}

class StringCount
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = scan.nextLine();
		Spacecount sc = new Spacecount();
		System.out.println(sc.spaceCount(s1));
	}
}