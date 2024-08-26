import java.util.*;
class LinkedListSample
{
  public static void main(String[] args)
  {
    List<Integer>MyList=new LinkedList<>();
    MyList.add(100);
    MyList.add(200);
    MyList.add(300);
    MyList.add(400);
    MyList.add(3,500);
    System.out.println(MyList);
  }
}
