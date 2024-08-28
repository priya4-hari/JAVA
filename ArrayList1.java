import java.util.*;
class ArrayList1
{
  public static void main(String[] args)
  {
    List<String>myList=new ArrayList<String>(5);
    myList.add("Geeks");
    myList.add("for");
    myList.add("Geeks");
    myList.add(0,"Hello");
    for(String str:myList)
    {
      System.out.println(str);
    }
  }
}
