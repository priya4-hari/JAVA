import java.util.*;
class fibonacci
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    for(int i=0;i<x;i++)
    {
      System.out.println(fibo(i));
    }
  }
  public static int fibo(int m)
  {
    if(m==0)
    {
      return 0;
    }
    if(m==1 || m==2)
    {
      return 1;
    }
    return (fibo(m-1)+fibo(m-2));
  }
}
