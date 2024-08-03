import java.util.*;
import java.math.*;
class Armstrong
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    for(int i=0;i<=x;i++)
    {
      Arm(i);
    }
  }
  public static void Arm(int n)
  {
    int temp1=n;
    int temp2=n;
    int count=0;
    int sum=0;
    int r=0;
    while(n!=0)
    {
      r=n%10;
      count++;
      n=n/10;
    }
    while(temp1!=0)
    {
      r=temp1%10;
      sum+=(Math.pow(r,count));
      temp1=temp1/10;
    }
    if(sum==temp2)
    {
      System.out.print(temp2+" ");
    }
  }
}
