import java.util.Scanner;
class Program18
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=x;
		int s=0;
		for(;x!=0;)
		{
			int r=x%10;
			s+=r;
			x=x/10;
		}
		System.out.println(y+"->"+s);
		}
}