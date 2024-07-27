import java.util.*;
class prime
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int flag=0;
    if(x==0 || x==1)
    {
      System.out.println(x+" is not prime");
    }
    else{
    for(int i=2;i<=(x/2);i++)
    {
      if(x%i==0)
      {
        flag=1;
        break;
      }
    }
    if(flag==0)
    {
      System.out.println(x+" is prime");
    }
    else
    {
      System.out.println(x+" is not prime");
    }
  }
}
}
