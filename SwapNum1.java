import java.util.*;
class Swap
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    int t=0;
    System.out.println("x= "+x);
    System.out.println("y= "+y);
    t=x;
    x=y;
    y=t;
    System.out.println("x= "+x);
    System.out.println("y= "+y);
  }
}
