import java.util.*;
class ReverseNum
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    String t = Integer.toString(x);
    String st="";
    for(int i=t.length()-1;i>=0;i--)
    {
      st=st+t.charAt(i);
    }
    System.out.println(st);
  }
}
