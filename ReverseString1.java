import java.util.*;
class Reverse
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String t="";
    for(int i=s.length()-1;i>=0;i--)
    {
      t=t+s.charAt(i);
    }
    System.out.println(t);
  }
}
