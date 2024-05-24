class Program9
{
	public static void main(String args[])
	{
		if(args[0].equals("Female"))
		{
			int x=Integer.parseInt(args[1]);
			if((x>=1) && (x<=58))
			{
				System.out.println("8.2%");
			}
			else
			{
				System.out.println("7.6%");
			}
		}
		else
		{
			int x=Integer.parseInt(args[1]);
			if((x>=1) && (x<=60))
			{
				System.out.println("9.2%");
			}
			else
			{
				System.out.println("8.3%");
			}
		}
}
}