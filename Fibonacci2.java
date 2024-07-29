import java.util.*;
class fibonacci
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x=scan.nextInt();
    int a=0;
    int b=1;
    int c;
    System.out.println(a);
    System.out.println(b);
    for(int i=2;i<x;i++)
   {
     c=a+b;
     System.out.println(c);
     a=b;
     b=c;
   }  
 }
 }
