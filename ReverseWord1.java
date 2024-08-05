import java.util.*;
class Reverse
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String[] arr = s.split(" ");
    for(int i=0;i<arr.length;i++)
    {
      String str = arr[i];
      StringBuffer sb = new StringBuffer(str);
      sb.reverse();
      String t=sb.toString();
      System.out.println(t);
    }
  }
}
