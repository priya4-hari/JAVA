import java.util.*;
class RemoveMethod
{
  public static void main(String[] args)
  {
    List<String>myList=new ArrayList<String>(5);
    myList.add("Hello");
    myList.add("Welcome");
    myList.add("to");
    myList.add("Geeks");
    myList.add("For");
    myList.add("Geeks");
    System.out.println(myList);
    myList.remove(3);
    System.out.println(myList);
  }
}
