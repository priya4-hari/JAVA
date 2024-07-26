import java.util.*;
class FindOddEven
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x=scan.nextInt();
    if((x&1)==0)
    {
      System.out.println(x+" is even");
    }
 else
 {
   System.out.println(x+" is odd");
 }  
 }
 } 
