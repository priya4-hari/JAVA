import java.util.*;
class prime
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    if(isprimeNum(x))
    {
      System.out.println(x+" is prime");
    }
    else
    {
      System.out.println(x+" is not prime");
    }
  }
  public static boolean isprimeNum(int n)
  {
    if(n<=1)
    {
      return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
}
