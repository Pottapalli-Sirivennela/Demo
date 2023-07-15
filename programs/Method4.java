class Calculator
{
	int c;
	int add(int a, int b)
	{
		c=a+b;
		return c;
	}
}

class Method4
{
	public static void main(String args[])
	{
		Calculator Calc = new Calculator();
		int num1=50;
		int num2=40;
		int res = Calc.add(num1,num2);
		System.out.println(res);
	}
}