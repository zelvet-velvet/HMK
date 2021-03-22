import java.util.*;
class lab9 {
  public static void main(String[] args) {
    while(true)
    {
      Scanner sb=new Scanner(System.in);
      System.out.println("\n");
      System.out.println("press 1: For loop.\npress 2: While loop." );
      int a=sb.nextInt();
      char b=0; 
      if(a==1)
      {
        b='+';
      }
      else if(a==2)
      {
        b='-';
      }
      switch(b)
      {
        case'+':
          ffor();
          break;
        case'-':
          wwhile();
          break;
        default:
          System.out.println("Enter wrong buttom.");
          break;
      }
    }
  }
  public static void wwhile(){
    int i=1, l=0;
    while(i<1001)
    {
      if(i%2==0)
      {
        System.out.print(i+" ");
      }
      else if(i%2!=0)
      {
        System.out.print(i+" ");
      }
      i++;
    }
  } 
  public static void ffor(){
    for(int i=1;i<1001;i+=2)
    {
      System.out.print(i+" ");
    }
    for(int i=2;i<1001;i+=2)
    {
      System.out.print(i+" ");
    }
  }
}