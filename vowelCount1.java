import java.util.*;
class Vowels
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    int vowel=0;
    int cons=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||
      s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||
      s.charAt(i)=='O' ||s.charAt(i)=='U' )
      {
        vowel++;
      }
      else
      {
        if(s.charAt(i)!=' ')
        {
        cons++;
      }
    }
 p   }
    System.out.println("vowels: "+vowel);
    System.out.println("consonents: "+cons);
  }
}
