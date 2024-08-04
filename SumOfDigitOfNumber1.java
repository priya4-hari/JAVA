import java.util.*;
class SumOfDigits
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int r,sum=0;
    while(x!=0)
    {
      r=x%10;
      sum+=r;
      x=x/10;
    }
    System.out.println(sum);
  }
}
