import java.util.*;
class Main {
  static int anime;
  
  public static void ww(int i) {
    try
    {
      for(int j = 0 ; j<=3 ; j++)
      {
        switch(anime)
        {
          case 1:
            System.out.print("Papper!!");
            break;
          case 2:
            System.out.print("Scissor!!");
            break;
          case 3:
            System.out.print("Stone!!");
            break;
          default:
            anime = 0;
        }
        anime++;
        Thread.sleep(i);
      }
      System.out.print("\r                          ");
      System.out.print("\n");
    }
    catch(InterruptedException e)
    {
      System.out.println(e);
    }
  }
  public static void main(String args[]) 
  {
    int i =550;
    ww(i);
    
  }
}