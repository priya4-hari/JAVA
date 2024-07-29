import java.util.*;
class Prime
{
  public static void main(String[] args)
 {
   Scanner scan = new Scanner(System.in);
   int x=scan.nextInt();
   if(x<=1)
   {
     System.out.println(x+" is not prime number");
   }
   else
   {
     int count=0;
     for(int i=2;i<=(x/2);i++)
     {
       if(x%i==0)
       {
         count++;
       }
     }
     if(count==0)
     {
       System.out.println(x+" is prime number");
     }
     else
     {
       System.out.println(x+" is not prime number");
     }
   }
 }
 }
