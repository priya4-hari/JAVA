import java.util.*;
class Palindrome
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int input=x;
    int sum=0,r;
    while(x!=0)
    {
      r=x%10;
      sum=(sum*10)+r;
      x=x/10;
    }
    if(sum==input)
    {
      System.out.println("Palindrome");
    }
else
{
  System.out.println("Not Palindrome");
} 
  }
}
