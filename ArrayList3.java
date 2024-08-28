import java.util.*;
class ArrayList3
{
  public static void main(String[] args)
  {
    List<Integer> myList=new ArrayList<>();
    myList.add(10);
    myList.add(20);
    myList.add(30);
    System.out.println(myList);
    List<Integer> newList = new ArrayList<>();
    newList.add(100);
    newList.add(200);
    newList.add(300);
    System.out.println(newList);
    myList.addAll(newList);
    System.out.println(myList);
    for(Integer x:myList)
    {
      System.out.println(x);
    }
  }
}
