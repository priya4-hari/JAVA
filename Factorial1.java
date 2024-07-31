import java.util.*;
class factorial
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int result=1;
    for(int i=x;i>=1;i--)
    {
      result=result*i;
    }
    System.out.println(result);
  }
}
