import java.util.*;
class ListSizeMethod
{
  public static void main(String[] args)
  {
    List<String>myList=new ArrayList<String>();
    myList.add("Geeks");
    myList.add("For");
    myList.add("Geeks");
    int count=myList.size();
    System.out.println(count);
  }
}
