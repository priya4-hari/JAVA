import java.util.Scanner;
class Program29
{
	public static void main(String args[])
	{
	int[] a={2,33,1,6,77,1};
	int i,j,t;
	int n=a.length;
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
	System.out.println("Sorted array:");
	for(i=0;i<=n-1;i++)
	{
		System.out.println(a[i]);
	}
}
}