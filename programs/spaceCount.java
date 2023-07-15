class Spacecount
{
	int spaceCount(String s)
	{
		string[] s = new arr[5];
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s[i]==' ')
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
		Spacecount sc = new Spacecount();
		String a = "How are you";
		System.out.println(sc.spaceCount(a));
	}
}