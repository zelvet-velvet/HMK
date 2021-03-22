import java.util.*;
class Main {
  public static void main(String[] args) {
    int i=1, j=0, l=0, k=1;
    while(i<6)
    {
      while(l<j+1)
      {
        if(k<10)
        {
          System.out.print(k+" ");
        }
        else
        {
          System.out.print(k);
        }
        l++;
        k++;
      }
      l=0;
      j++;
      System.out.println("");
      i++;
    }
  }
}
