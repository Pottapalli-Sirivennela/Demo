import java.util.Scanner;
class Demo
{
	int indexOf(String s, String c)
	{
		char t = c.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==t)
			{
				return i;
			}
		}
		return -1;
	}
}

class Indexof
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string 1:");
		String s1 = scan.nextLine();
		System.out.println("Enter string 2:");
		String s2 = scan.nextLine();
		Demo io = new Demo();
		System.out.println(io.indexOf(s1,s2));
	}
}