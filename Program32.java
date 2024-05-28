import java.util.Scanner;
class Program32
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		int s=0,i,j,n=a.length,k=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<=n-1;i++)
		{
			if(a[i]!=6 || a[n-1]==6)
			{
				s+=a[i];
			}
			else
			{
				for(j=i+1;j<n-1;j++)
				{
					if(a[j]==7)
					{
						break;
					}
				}
			for(k=j+1;k<=n-1;k++)
			{
				s+=a[k];
			}
			}
			if(k>(n-1))
			{
				break;
			}
			}
		System.out.println(s);
	}
}