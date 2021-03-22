import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sb=new Scanner(System.in);
    double x, n;
    double i=0, j=1, k=0, a=0, b=0, s=0;
    System.out.print("sinx, x= ");
    x=sb.nextInt();
    System.out.println("x^n, n= ");
    n=sb.nextInt();
    while(true)
    { 
      for(int i=1;i<a+1;i++)
      {
        while(j<i+1)
        {
          f=f*j;
          j++;
        }
        c=(i/f);
        h=h+c;
        c=0;
      }
      a=i*Math.pow(x,n)/k;
      s=s+a;
      if(x>0)
      {
        i=-1;
      }
      else if(x<0)
      {
        i=1;
      }
      b++;
      if(b)
    }
    System.out.println(s);
  }
}
