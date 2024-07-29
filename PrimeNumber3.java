import java.util.*;
class PrimeNum
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    for(int i=x;i<=y;i++)
    {
      if(i==0 || i==1)
      {
        System.out.println(i+" is not prime");
      }
      else
      {
        int flag=0;
        for(int j=2;j<=(i/2);j++)
        {
          if(i%j==0)
          {
            flag=1;
            break;
          }
        }
        if(flag==0)
        {
          System.out.println(i+" is prime");
        }
        else
        {
          System.out.println(i+" is not prime");
        }
      }
    }
  }
}
