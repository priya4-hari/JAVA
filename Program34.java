import java.util.Scanner;
class Program34
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		int j,i,max;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		max=a[0][0];
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("The biggest number in the given array is: "+max);
		}
}