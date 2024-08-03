import java.util.*;
class NumberOfDigits
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    String s = Integer.toString(x);
    System.out.println(s.length());
  }
}
