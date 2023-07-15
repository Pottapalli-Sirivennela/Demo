class Calculator
{
	int a=50;
	int b=40;
	
	void add()
	{
		int c;
		c=a+b;
		System.out.println(c);
	}


}


class Method1{
	public static void main(String args[])
	{
		Calculator Calc = new Calculator();
		Calc.add();
	}
}
		