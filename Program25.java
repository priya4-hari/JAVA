class Program25
{
	public static void main(String args[])
	{
		int a[]={11,2,33,14,5};
		int n=a.length;
		int t;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("Minimum number: "+a[0]);
		System.out.println("Maximum number: "+a[a.length-1]);
	}
}	