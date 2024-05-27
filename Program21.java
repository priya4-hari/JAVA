import java.util.Scanner;
class Program21
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int s=0;
		int m=x;
		while(x!=0)
		{
			int r=x%10;
			s=(s*10)+r;
			x=x/10;
		}
		if(s==m)
		{
			System.out.println(m+" is a palindrome");
		}
		else
		{
			System.out.println(m+" is not a palindrome");
		}
	}
}