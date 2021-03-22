import java.util.Scanner;
import java.util.Random; 
class Main {
  public static void main(String[] args) {
    int comp, player, psst;
    psst=15;
    Random dsb = new Random(); 
    comp=dsb.nextInt(3); 
    String a, b, c, w, l;
    a = "paper";
    b = "scissor";
    c = "stone";
    w = "win";
    l = "lose";

    Scanner sb= new Scanner(System.in);

    System.out.println("paper 0 scissor 1 stone 2 !?");
    player=sb.nextInt();
    while(true)
    {
      if(player==comp)
      {
        if(player==0)
        {
          System.out.println("Computor is "+a+"You are "+a+ "You're" + "tie" );
        }
        else if(player==1)
        {
          System.out.println("Computor is "+b+"You are "+b+ "You're" + "tie" );
        }
        if(player==2)
        {  
          System.out.println("Computor is "+b+"You are "+a+ "You're" + "tie" );
        }       
      }
      else if(player!=comp)
      {
        while(player==0&&comp==1)
        {
          psst=0;
          break;
        }
        while(player==0&&comp==2)
        {
          psst=1;
          break;
        }
        while(player==1&&comp==0)
        {
          psst=2;
          break;
        }
        while(player==1&&comp==2)
        {
          psst=3;
          break;
        }
        while(player==2&&comp==1)
        {
          psst=4;
          break;
        }
        while(player==2&&comp==0)
        {
          psst=5;
          break;
        }
        switch(psst)
        {
          case 0:
            System.out.println("Computor is "+b+". \nYou are "+a+"."+ "\nYou're "+l+"." );
            break;

          case 1:
            System.out.println("Computor is "+c+". \nYou are "+a+"."+ " \nYou're " + w +".");
            break;

          case 2:
            System.out.println("Computor is "+a+". \nYou are "+b+"."+ " \nYou're "+w +".");
            break;

          case 3:
            System.out.println("Computor is "+c+". \nYou are "+b+"."+ " \nYou're " + l +".");
            break;

          case 4:
            System.out.println("Computor is "+b+". \nYou are "+c+"."+ " \nYou're " +w +".");
            break;

          case 5:
            System.out.println("Computor is "+c+". \nYou are "+a+"."+ " \nYou're "+w+"." );
            break;

          default:
            System.out.println("You're cheating!? That not allow!");
            return;
        }
      }
      break;
    }

    
  }
} 
