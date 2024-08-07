import java.util.*;
class Palindrome
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s=scan.nextLine();
    String t="";
    for(int i=s.length()-1;i>=0;i--)
    {
      t=t+s.charAt(i);
    }
    if(s.equals(t))
    {
      System.out.println("Palindrome");
    }
    else
    {
      System.out.println("Not Palindrome");
    }
  }
}
