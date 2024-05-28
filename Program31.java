import java.util.Scanner;
class Program31
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[7];
		System.out.println("enter array ele:");
		int i,n=7,j,t;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The array is:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		int count=1;
		int flag=0;
		int p=0;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
			if(a[i]==a[j])
			{
				++count;
				if(flag<count)
				{
					flag=count;
					p=a[i];
				}
			}
		}
		}
		System.out.println("Highest occurence:");
		System.out.println(p);
		}
}
				