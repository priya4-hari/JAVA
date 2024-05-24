import java.util.Scanner;
class Program8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		int a=(int)c;
		if((a>=65)&&(a<=90)  ||   (a>=97)&&(a<=122))
		{
			System.out.println("Alpha");
		}
		else if((a>='1')&&(a<='9'))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special characters");
		}
	}
}	