import java.util.Scanner;
class Program7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two char:");
		char c=sc.next().charAt(0);
		char d=sc.next().charAt(0);
		int a=(int)c;
		int b=(int)d;
		if(a>b)
		{
			System.out.println(d+","+c);
		}
		else
		{
			System.out.println(c+","+d);
		}
	}
}
		