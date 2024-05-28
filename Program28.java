import java.util.Scanner;
class Program28
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of a array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		int n=a.length;
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
				}
			}
		}
		System.out.println();
		System.out.println("largest 2 numbers: "+a[n-1]+" "+a[n-2]);
		System.out.println("smallest 2 numbers: "+a[0]+" "+a[1]);
	}
}
		