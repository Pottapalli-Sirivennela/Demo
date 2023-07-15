import java.util.Scanner;
class Demo
{
	String toLowerCase(String s)
	{
		String t = "";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='A' && c<='Z')
			{
				t=t+(char)(c+32);
			}
			else
			{
				t=t+c;
			}
		}
		return t;
	}
}

class Lowercase
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = scan.nextLine();
		Demo lc = new Demo();
		System.out.println(lc.toLowerCase(s1));
	}
}