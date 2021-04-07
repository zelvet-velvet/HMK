import java.util.*;
class tt2 {
  public static void main(String[] args) {
    int[] a=new int [10];
    Scanner sb=new Scanner(System.in);
    int i=0, c;
    while(i<10)
    {
      System.out.println("number "+(i+1));
      c=sb.nextInt();
      a[i]=c;
      i++;
    }
    sum(a);
    product(a);
  }
  public static void sum(int[] a){
    int h=0;
    for(int i=0;i<10;i++)
    {
      h=h+a[i];
    }
    System.out.println(h);
  }
  public static void product(int [] a){
    int h=1;
    for(int i=0;i<10;i++)
    {
      h=h*a[i];
    }
    System.out.println(h);
  }

}
