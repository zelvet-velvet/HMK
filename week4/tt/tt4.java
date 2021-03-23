import java.util.*;
class tt4 {
  static Scanner sb=new Scanner(System.in);
  static double x, n, s=0;
  public static void main(String[] args) {
    double t=0, w=0;
    System.out.println("sin ?cos? tan?");
    String tri =sb.nextLine();
    System.out.print("X= ");
    x=sb.nextInt();
    System.out.print("n= ");
    n=sb.nextInt();
   
    switch(tri)
    {
      case"sin":
        sin(x,n);
        System.out.println(-s);
        break;
      case"cos":
        cos(x,n);
        System.out.println(s);
        break;
      case"tan":
        sin(x,n);
        t=-s;
        cos(x,n);
        w=s;
        System.out.println(t/w);
        break;
      default:
        System.out.println("Function no found.");
        break;
    }
    
  }
  public static double sin(double x,double n){
    double w=0, f=1;
    double k=0, j=1, l=1, i=1, h=0;//tool
    while(w<n)
    { 
      while(j<l+1)
      {
        f=f*j;
        j++;
      }
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
      h=(Math.pow(x,l))/f;
      s=s+i*h;
      //

      j=1;
      f=1;
      l+=2;
      w++;
    }
    return s;
  }
  public static double cos(double x,double n){
    double w=0, f=1;
    double k=0, j=1, l=0, i=1, h=0;
    while(w<n)
    { 
      if(w==0)
      {
        f=1;
      }
      else
      {
        while(j<l+1)
        {
          f=f*j;
          j++;
        }
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
      j=1;
      f=1;
      l+=2;
      w++;
    }
    return s;
  }
}