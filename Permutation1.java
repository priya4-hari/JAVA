import java.util.*;
class Permutation
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    int r= scan.nextInt();
    int fact1=1;
    for(int i=1;i<=n;i++)
    {
      fact1=fact1*i;
    }
    int rem = n-r;
    int fact2=1;
    for(int i=1;i<=rem;i++)
    {
      fact2=fact2*i;
    }
    int ans = fact1/fact2;
    System.out.println(ans);
  } 
 }   
