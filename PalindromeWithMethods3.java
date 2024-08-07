import java.util.*;
class Palindrome
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String t=scan.nextLine();
    int start=0;
    int end=t.length()-1;
    int flag=0;
    while(start<end)
    {
      if(t.charAt(start)!=t.charAt(end))
      {
        System.out.println("Not Palindrome");
        flag=1;
        break;
      }
      start++;
      end--;
    }
    if(flag==0)
    {
      System.out.println("Palindrome");
    }
  }
}
