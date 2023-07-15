class Calculator
{
	int a = 50;
	int b = 40;
	
	int add()
	{
		int c;
		c = a+b;
		return c;
	}

}

class Method2
{
	public static void main(String args[])
	{
		Calculator Calc = new Calculator();
		int res = Calc.add();
		System.out.println(res);
	}
}