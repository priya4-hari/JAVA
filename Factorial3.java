import java.util.*;
class Factorial
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int i=1,sum=1;
    for(;i<=x;)
    {
      sum=sum*i;
      i++;
    }
    System.out.println(sum);
  }
}
