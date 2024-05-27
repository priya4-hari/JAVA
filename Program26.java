import java.util.Scanner;
class Program26
{
	public static void main(String args[])
	{
		int[] a={1,4,34,56,7};
		int n=a.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter search element:");
		int x=sc.nextInt();
		int flag=0,i;
		for(i=0;i<n-1;i++)
		{
			if(x==a[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(i+1);
		}
		else
		{
			System.out.println("-1");
		}
	}
}
			