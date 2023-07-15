class Addition
{
	int add(int x, int y)
	{
		return x+y;
	}
	
	float add(int x, float y)
	{
		return x+y;
	}

	float add(float x, int y)
	{
		return x+y;
	}
	
	float add(float x, float y)
	{
		return x+y;
	}
	
	double add(float x, double y)
	{
		return x+y;
	}

	double add(double x, double y)
	{
		return x+y;
	}

	int add(int x, int y, int z)
	{
		return x+y+z;
	}
	
	float add(int x, int y, float z)
	{
		return x+y+z;
	}
	
	float add(float x, float y,int z)
	{
		return x+y+z;
	}

	double add(double x, double y, double z)
	{
		return x+y+z;
	}

	double add(float x, double y,double z)
	{
		return x+y+z;
	}
}

class Day20
{
	public static void main(String args[])
	{
		Addition s = new Addition();
		int l=100,m=200,n=300;
		float a=10.5f,b=20.5f,c=30.5f;
		double p=100.5,q=200.5,r=200.5;
		System.out.println(s.add(a,p));
		System.out.println(s.add(p,q,r));
		System.out.println(s.add(a,p,q));
		System.out.println(s.add(l,m));
		System.out.println(s.add(a,n));
	}
}