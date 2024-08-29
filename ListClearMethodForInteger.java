import java.util.*;
class ListClear
{
  public static void main(String[] args)
  {
    List<Integer>myList=new ArrayList<Integer>(3);
    myList.add(10);
    myList.add(20);
    myList.add(30);
    myList.add(40);
    myList.add(50);
    myList.add(60);
    System.out.println(myList);
    myList.clear();
    System.out.println(myList);
  }
}
