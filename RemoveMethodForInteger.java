import java.util.*;
class RemiveMethod
{
  public static void main(String[] args)
  {
    List<Integer>myList=new ArrayList<Integer>(5);
    myList.add(10);
    myList.add(20);
    myList.add(30);
    myList.add(40);
    myList.add(50);
    System.out.println(myList);
    myList.remove(2);
    System.out.println(myList);
  }
}
