import java.util.*;
class SumOfDigitOfNumber
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int sum,r=0;
    for(sum=0;x!=0;sum+=x%10,x=x/10)
    {
    }
    System.out.println(sum);
  }
}
