import java.util.*;
class sumOfDigitOfNumber
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    System.out.println(isSum(x));
  }
  public static int isSum(int n)
  {
    return n==0?0:((n%10)+isSum(n/10));
  }
}
