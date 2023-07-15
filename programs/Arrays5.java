class Arrays5
{
	public static void main(String args[])
	{
		int[][][] a = {{{10,20,30},{10,20,30,40},{10,20}},{{10,20,30,40,50},{10,20,30}}};
		int i,j,k;
	
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				for(k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}