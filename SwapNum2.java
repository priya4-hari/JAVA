import java.util.*;
class Swap
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x=scan.nextInt();
    int y=scan.nextInt();
    System.out.println("x= "+x);
    System.out.println("y= "+y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("x= "+x);
    System.out.println("y= "+y);
  } 
 }   
