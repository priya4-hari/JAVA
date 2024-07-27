import java.util.*;
class findOddEven
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
   if(x==0)
   {
      System.out.println(x+" is Zero");
    }
    else
    {
    if(Integer.toBinaryString(x).endsWith("0"))
    {
      System.out.println(x+" is even");
    }
    else
    {
      System.out.println(x+" is odd");
    }
 }
 }
 }
