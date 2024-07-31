import java.util.*;
class Factorial
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int sum=1;
    for(int i=1;i<=x;i++)
    {
      sum=sum*i;
    }
    System.out.println(sum);
  }
}
