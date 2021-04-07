import java.util.*;
class tt3 {
  static int v=0;
  public static void main(String[] args) {
    int[] a=new int [20];
    Scanner sb=new Scanner(System.in);
    int i=0, c, u;
    while(i<20)
    {
      System.out.println("number "+(i+1));
      c=sb.nextInt();
      a[i]=c;
      i++;
    }
    formulap(a);
    System.out.println("positive number: "+v);
    v=0;
    formulan(a);
    System.out.println("negtive number: "+v);
    v=0;
    formulao(a);
    System.out.println("odd number: "+v);
    v=0;
    formulae(a);
    System.out.println("even number: "+v);
    v=0;
    formula0(a);
    System.out.println("0 : "+v);
  }
  public static int formulap(int[] a){
    for(int d=0;d<20;d++)
    {
      if(a[d]>=0)
      {
        v++;
      }
      else
      {
        continue;
      }
    }
    return v;
  }
   public static int formulan(int[] a){
    for(int d=0;d<20;d++)
    {
      if(a[d]<=0)
      {
        v++;
      }
      else
      {
        continue;
      }
    }
    return v;
  }
   public static int formulao(int[] a){
    for(int d=0;d<20;d++)
    {
      if(a[d]%2!=0)
      {
        v++;
      }
      else
      {
        continue;
      }
    }
    return v;
  }
   public static int formulae(int[] a){
    for(int d=0;d<20;d++)
    {
      if(a[d]%2==0)
      {
        v++;
      }
      else
      {
        continue;
      }
    }
    return v;
  }
   public static int formula0(int[] a){
    for(int d=0;d<20;d++)
    {
      if(a[d]==0)
      {
        v++;
      }
      else
      {
        continue;
      }
    }
    return v;
  }
}
