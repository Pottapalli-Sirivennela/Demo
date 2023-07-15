import java.util.Scanner;
class Demo
{
	String toUpperCase(String s)
	{
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='a' && c<='z')
			{
				t=t+(char)(c-32);
			}
			else
			{
				t=t+c;
			}
		}
		return t;
	}
}

class Uppercase
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = scan.nextLine();
		Demo uc = new Demo();
		System.out.println(uc.toUpperCase(s1));
	}
}