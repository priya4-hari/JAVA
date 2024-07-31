import java.util.*;
class Factorial
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int sum=fact(x);
    System.out.println(sum);
  }
  public static int fact(int n)
  {
    if(n==0)
    {
      return 1;
    }
    else
    {
      return (n*(fact(n-1)));
    }
  }
}
