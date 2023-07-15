import java.util.Scanner;
class WordCount
{
	int wordCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		return count+1;	
	}
}

class StringWord
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = scan.nextLine();
		WordCount wc = new WordCount();
		System.out.println(wc.wordCount(s1));
	}
}