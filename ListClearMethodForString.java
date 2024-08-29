import java.util.*;
class ListClear
{
  public static void main(String[] args)
  {
    List<String>myList=new ArrayList<String>(3);
    myList.add("Hello");
    myList.add("Geeks");
    myList.add("for");
    myList.add("Geeks");
    myList.add("Welcome");
    System.out.println(myList);
    myList.clear();
    System.out.println(myList);
  }
}
