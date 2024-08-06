import java.util.*;
class Duplicate
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s= scan.nextLine();
    HashMap<Character,Integer>HashArray = new HashMap<>();
   char[] p = s.toCharArray();
   for(char c:p)
    {
      if(HashArray.containsKey(c))
      {
        HashArray.put(c,HashArray.get(c)+1);
      }
      else
      {
        HashArray.put(c,1);
      }
    }
    Set<Character>setArray=HashArray.keySet();
    for(Character t:setArray)
    {
      if((HashArray.get(t)>1) && (t!=' '))
      {
        System.out.println(t+":"+HashArray.get(t));
      }
    }
  }
}
