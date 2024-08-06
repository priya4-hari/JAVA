import java.util.*;
class Count
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s= scan.nextLine();
    int count=0;
    for(int i=0;i<s.length()-1;i++)
    {
      if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
      {
        count++;
        i++;
      }
      else
      {
      }
    }
    System.out.println(count+1);
  }
}
