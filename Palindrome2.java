import java.util.*;
class Palindrome
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x=scan.nextInt();
    String str=Integer.toString(x);
    String t="";
    for(int i=str.length()-1;i>=0;i--)
    {
     t=t+str.charAt(i);
     }
     if(str.equals(t))
     {
       System.out.println("Palindrome");
     }
   else
   {
     System.out.println("Not Palindrome");
   }
 }
 }
