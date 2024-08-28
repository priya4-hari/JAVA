import java.util.*;
class LinkedList1
{
  public static void main(String[] args)
  {
    List<Integer>myList=new LinkedList<>();
    myList.add(10);
    myList.add(15);
    myList.add(20);
    System.out.println(myList);
    List<Integer>newList=new ArrayList<>();
    newList.add(100);
    newList.add(200);
    newList.add(300);
    System.out.println(newList);
    myList.addAll(newList);
    for(Integer i:myList)
    {
      System.out.println(i);
    }
  }
}
