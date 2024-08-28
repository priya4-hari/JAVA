import java.util.*;
class ArrayList2
{
  public static void main(String[] args)
  {
    List<Integer>myList=new ArrayList<Integer>(5);
    myList.add(10);
    myList.add(20);
    myList.add(30);
    myList.add(2,25);
    for(Integer str:myList)
    {
      System.out.println(str+" ");
    }
  }
}
