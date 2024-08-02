import java.util.*;
class ReverseNum
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    String s = Integer.toString(x);
    StringBuffer sb = new StringBuffer(s);
    sb.reverse();
    String t = sb.toString();
    int y = Integer.parseInt(t);
    System.out.println(y);
  }
}
