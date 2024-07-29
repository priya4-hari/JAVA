import java.util.*;
class fibonacci
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int[] f=new int[x];
    f[0]=0;
    f[1]=1;
    f[2]=1;
    for(int i=3;i<x;i++)
    {
      f[i]=f[i-1]+f[i-2];
    }
    for(int i=0;i<x;i++)
    {
      System.out.println(f[i]+" ");
    }
  }
}
