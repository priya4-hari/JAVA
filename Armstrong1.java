import java.util.*;
class Armstrong
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
   int count=0;
    int n=x;
    int t=x;
    int r=0,m=0,sum=0;
    while(x!=0)
    {
      r=x%10;
      count++;
      x=x/10;
    }
 while(n!=0)
 {
   m=n%10;
   int mul=1;
   for(int i=0;i<count;i++)
   {
     mul*=m;
   }
   sum+=mul;
   n=n/10;
 }  
 if(sum==t)
 {
   System.out.println("Armstrong");
 }
 else
 {
   System.out.println("Not Armstrong");
 }
 }
 }
