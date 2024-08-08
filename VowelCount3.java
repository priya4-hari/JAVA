import java.util.*;
class count
{
  public static void main(String[] args)
  {
    Scanner scan= new Scanner(System.in);
    String s=scan.nextLine();
    String t=s.toUpperCase();
    int vowel=0;
    int cons=0;
    for(int i=0;i<t.length();i++)
    {
      char c=t.charAt(i);
      if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
      {
        vowel++;
      }
      else
      {
        if(c!=' ')
        {
          cons++;
        }
      }
    }
    System.out.println("vowels: "+vowel);
    System.out.println("consonants: "+cons);
  }
}
