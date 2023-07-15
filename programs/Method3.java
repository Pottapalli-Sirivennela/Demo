class Calculator
{
	int c;
	void add(int a, int b)
	{
		c = a+b;
		System.out.println(c);
	}
}

class Method3
{
	public static void main(String args[])
	{
		Calculator Calc = new Calculator();
		int num1=50;
		int num2=40;
		Calc.add(num1,num2);
	}
}