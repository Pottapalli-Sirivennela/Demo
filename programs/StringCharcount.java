import java.util.Scanner;
class CharCount
{
	int charCount(String s,String t)
	{
		int count=0;
		char key = t.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==key)
			{
				count++;
			}
		}
		return count;
	}
}

class StringCharcount
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = scan.nextLine();
		String t = scan.nextLine();
		CharCount cc = new CharCount();
		System.out.println(cc.charCount(s1,t));
	}
}