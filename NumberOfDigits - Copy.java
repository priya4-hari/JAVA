import java.util.*;
class NumberOfDigits
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int count=0;
    int r;
    while(x!=0)
    {
      r=x%10;
      count++;
      x=x/10;
    }
    System.out.println(count);
  }
}
