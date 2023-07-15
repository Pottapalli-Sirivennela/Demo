class Arrays4
{
	public static void main(String args[])
	{
		int[][] a = {{10,20,30},{10,20},{10,20,30,40}};
		int i,j;
	
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}