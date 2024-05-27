import java.util.Scanner;
class Program20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int s=0;
		while(x!=0)
		{
			int r=x%10;
			s=(s*10)+r;
			x=x/10;
		}
		System.out.println(s);
		}
	}