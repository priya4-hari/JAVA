import java.util.Scanner;
class Program23
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter option:");
		int a,b;
		char c;
		int x=sc.nextInt();
		do
		{
			switch(x)
			{
			case 1:System.out.println("enter values:");
			       a=sc.nextInt();
			       b=sc.nextInt();
			       System.out.println(a+b);
			       break;
			case 2:System.out.println("enter values:");
			       a=sc.nextInt();
			       b=sc.nextInt();
			       System.out.println(a-b);
			       break;	
			}
			System.out.println("Do you want to continue:");
			c=sc.next().charAt(0);
			if(c=='y' || c=='Y')
			{
			System.out.println("enter option:");
			x=sc.nextInt();
			}
		}while(c=='y' || c=='Y');
	}
}	