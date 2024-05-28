class Program27
{
	public static void main(String args[])
	{
		int[] a={67,65,78,66,90};
		int n=a.length;
		char[] b=new char[a.length];
		for(int i=0;i<=n-1;i++)
		{
			b[i]=(char)a[i];
		}
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(b[i]+" ");
		}	
	}
}