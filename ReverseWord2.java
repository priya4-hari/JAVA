import java.util.*;
class Reverse
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String[] arr = s.split(" ");
    for(int i=0;i<arr.length;i++)
    {
      String str=arr[i];
     String p="";
    for(int j=str.length()-1;j>=0;j--)
     {
      p=p+str.charAt(j);
   }
    System.out.println(p);
    }
  }
}
