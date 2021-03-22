import java.util.*;
import java.util.Scanner;
class lab8 {
  public static void main(String[] args) {
    Scanner sb= new Scanner(System.in);
    Random dsb = new Random(); 
    int rn=dsb.nextInt(101); 
    int b, i=1, l=1, j=0;
    while(l==1)
    {
      b=sb.nextInt();
      if(b==rn)
      {
        System.out.println("You did it! Answer is "+rn+"~!");
        l++;
      }
      else 
      {
        if(b>rn)
        {
          System.out.println("Too high, try again.");
        }
        else if(b<rn)
        {
          System.out.println("Too low, try again.");
        }      
      }
      i++;
    }
	j=i-1;
    System.out.println("You tried "+j+" times.");
  }
}
