import java.util.Scanner;
class Program33
{
	public static void main(String args[])
	{
		int[][] a=new int[2][2];
		int i,j;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=a.length-1;i>=0;i--)
		{
			for(j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
}
}