import java.util.Scanner;
class Program4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x==0)
		{
			System.out.println("Zero");
		}
		else if(x<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Positive");
		}
	}
}