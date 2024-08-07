import java.util.*;
class Count
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    HashMap<String,Integer>HashArray=new HashMap<>();
    for(String t:s.split(" "))
    {
      if(HashArray.containsKey(t))
      {
        HashArray.put(t,HashArray.get(t)+1);
      } 
     else
     {
       HashArray.put(t,1);
     }  
      }
      System.out.println("Count of Words: "+HashArray);
    }
  }
