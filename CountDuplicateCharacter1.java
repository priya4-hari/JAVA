import java.util.*;
class Duplicate
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    char[] p= new char[20];
    int k=-1;
    for(int i=0;i<=s.length()-1;i++)
    {
    if(s.charAt(i)==' ')
      {
       ;
      }
      else{
       p[++k]=s.charAt(i);
     }
    }
    char t;
    int n=k+1;
    for(int i=0;i<n;i++)
    {
      for(int j=1;j<(n-i);j++)
      {
        if(p[j-1]>p[j])
        {
          t=p[j-1];
          p[j-1]=p[j];
          p[j]=t;
        }
      }
    }
    int count=1;
    int i;
    for( i=0;i<p.length-1;i++)
    {
      if((p[i]!=p[i+1]))
      {
        if(count>1)
        {
          System.out.println(p[i]+":"+(count));
        }
        count=1;
      }
      else
      {
       ++ count;
      }
    }
       if(count>1)
        {
          System.out.println(p[p.length-1]+":"+(count));
        }
  }
}
