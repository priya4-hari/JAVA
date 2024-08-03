import java.util.*;
class Armstrong
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x=scan.nextInt();
    int m=x;
    int n=x;
    int count=0;
    int sum=0;
    for(;m!=0;m/=10,++count)
    while(n!=0)
    {
      sum+=(Math.pow((n%10),count));
    }
    if(sum==x)
    {
      System.out.println("Armstrong");
    }
    else
    {
      System.out.println("not Armstrong");
    }
  }
}
