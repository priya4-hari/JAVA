import java.util.*;
class Reverse
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    StringBuffer sb = new StringBuffer(s);
    sb.reverse();
    String t = sb.toString();
    System.out.println(t);
  }
}
