class Program22
{
	public static void main(String args[])
	{
			int count=0,i=1;
			while(i!=0)
			{
				if(i%2==0 && i%3==0 && i%5==0 && count<5)
				{
					System.out.print(i+" ");
					count++;
				}
				i++;
			}
	}
}
				