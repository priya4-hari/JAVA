import java.util.*;
class Palindrome
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    StringBuffer sb = new StringBuffer(s);
    sb.reverse();
    String t=sb.toString();
    if(s.equals(t))
    {
      System.out.println("Palindrome");
    }
    else
    {
      System.out.println("Not Palindrome");
    }
  }}
