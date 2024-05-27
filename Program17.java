class Program17
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		if(x==0 || x==1)
		{
			System.out.println(x+"is neither prime nor composite");
		}
		else if(x>1)
		{
			int flag=0;
			for(int i=2;i<=x/2;i++)
			{
				if(x%i==0)
				{
					flag=1;
					break;
				}			
			}
			if(flag==0)
			{
				System.out.println(x+" is prime number");
			}
			else
			{
				System.out.println(x+" is not prime number");
			}	
		}
		else
		{
			System.out.println("please enter an integer number");
		}
	}
}