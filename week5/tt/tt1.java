import java.util.*;
class tt1 {
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
    System.out.println(Arrays.toString(a));
  }
}
