import java.util.*;
class ListSizeMethod
{
  public static void main(String[] args)
  {
    List<Integer>myList=new ArrayList<Integer>();
    myList.add(10);
    myList.add(20);
    myList.add(30);
    myList.add(40);
    myList.add(50);
    int count=myList.size();
    System.out.println(count);
  }
}
