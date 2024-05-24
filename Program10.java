import java.util.Scanner;
class Program10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		int x=(int)c;
		if((x>=65) && (x<=90))
		{
			int m=x-65;
			int n=97+m;
			char h=(char)n;	
			System.out.println(c+"->"+h);
			}
		else
		{
			int m=x-97;
			int n=65+m;
			char h=(char)n;	
			System.out.println(c+"->"+h);
		}
	}
}