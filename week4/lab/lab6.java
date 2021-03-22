import java.util.*;
class lab6 {
  public static void main(String[] args) {
    Scanner sb=new Scanner(System.in);
    double x, n;
    double s=0, w=0, f=1;
    double k=0, j=1, l=1, i=1, h=0;//tool
    System.out.print("sinx, x= ");
    x=sb.nextInt();
    System.out.print("");
    System.out.print("x^n, n= ");
    n=sb.nextInt();
    while(w<n)
    { 
      while(j<l+1)
      {
        f=f*j;
        j++;
      }
      //
      h=(Math.pow(x,l))/f;
      s=s+i*h;
      //
      if(i>0)
      {
        i=i*-1;
      }
      else if(i<0)
      {
        i=i*-1;
      }
      //
	  System.out.println(s+" "+i+" "+h);
      j=1;
      f=1;
      l+=2;
      w++;
    }
    System.out.println(s);
  }
    
}
