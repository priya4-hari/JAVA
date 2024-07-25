import java.util.*;
class OddOrEven
{
  public static void main(String[] args)
  {
    Scanner scan =new Scanner(System.in);
    int x=scan.nextInt();
    String y=(x%2==0)?(x+" is "+"even"):(x+" is "+"odd");
    System.out.println(y);
  }}
