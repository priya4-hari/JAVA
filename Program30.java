class Program30
{
	public static void main(String args[])
	{
		int[] a={12,34,12,45,67,89};
		int n=a.length,i,j,t,k;
		int[] b=new int[n];
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
		}
		k=0;
		for(i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				b[k++]=a[i];
				
			}
		}
		b[k++]=a[n-1];
		for(i=0;i<k;i++)
		{
			a[i]=b[i];
		}
		System.out.println("After removing duplicate:");
		for(i=0;i<k;i++)
		{
			System.out.println(a[i]);
		}
		}
}	