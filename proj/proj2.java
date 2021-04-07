import java.util.Scanner;
import java.util.Random; 
class proj2 {
  static int anime=1;
  static Scanner sb=new Scanner(System.in); 
  public static void main(String[] args) {
	int i =40;
	cls();
	pp(i);
	cls();
	sc(i);
	cls();
	st(i);
	cls();
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
            System.out.println("Computor is "+b+". \nYou are "+a+"."+ "\nYou "+l+"." );
            break;

          case 1:
            System.out.println("Computor is "+c+". \nYou are "+a+"."+ " \nYou " + w +".");
            break;

          case 2:
            System.out.println("Computor is "+a+". \nYou are "+b+"."+ " \nYou "+w +".");
            break;

          case 3:
            System.out.println("Computor is "+c+". \nYou are "+b+"."+ " \nYou " + l +".");
            break;

          case 4:
            System.out.println("Computor is "+b+". \nYou are "+c+"."+ " \nYou " +w +".");
            break;

          case 5:
            System.out.println("Computor is "+c+". \nYou are "+a+"."+ " \nYou "+w+"." );
            break;

          default:
            System.out.println("You're cheating!? That not allow!");
            return;
        }
      }
      break;
    }
  }
	public static void st(int i) {
    try
    {
      for(int j = 0 ; j<10 ; j++)
      {
        switch(anime)
        {
          case 1:
            System.out.println("⠀⠀⡠⠔⠒⠒⡖⠉⠉⠉⢢⠤⠄⣀");
            break;
          case 2:
            System.out.println("⠀⢸⠀⠀⠀⠀⡇⠀⠀⠀⢸⠀⠀⠀⠱");
            break;
          case 3:
            System.out.println("⠀⢸⠀⠀⠀⠀⣇⠀⠀⠀⢸⠀⠀⠀⢸⠉⠉⢒⡀");
            break;
		  case 4:
		    System.out.println("⠀⡼⠐⠒⠈⠉⠉⠑⠢⡀⢸⠀⠀⠀⡎⠀⠀⢸⠇");
	    	break;
	  	  case 5:
	    	System.out.println("⡘⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⢤⠀⢠⠁⠀⠀⢸");
	        break;
	  	  case 6:
	    	System.out.println("⡇⠀⠀⠀⣀⠤⢀⣀⢀⣀⡠⠜⠒⠚⠤⣀⡠⢿");
	    	break;
	  	  case 7:
	    	System.out.println("⡇⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⢸");
	    	break;
	  	  case 8:
	    	System.out.println("⠈⠢⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠌");
	    	break;
	  	  case 9:
	    	System.out.println("⠀⠀⠀⠉⠒⠤⢄⣀⣀⠀⠀⢀⣀⣀⠤⠒⠁");
	    	break;
          default:
            anime = 0;
        }
        anime++;
        Thread.sleep(i);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println(e);
    }
  }
 public static void sc(int i) {
    try
    {
      for(int j = 0 ; j<13 ; j++)
      {
        switch(anime)
        {
          case 1:
            System.out.println("⠀⡤⠀⠤⡀⠀⠀⠀⢀⠀⣀⠀");
            break;
          case 2:
            System.out.println(" ⡇⠀⠀⠃⠀⠀⢠⠁⠀⠀⠁");
            break;
          case 3:
            System.out.println(" ⡇ ⠀⠸⠀⠀⡘⠀⠀⠀⡇");
            break;
		  case 4:
		    System.out.println("⠀⡇⠀⠀⢰⠀⠀⠇⠀⠀⢰");
	   		break;
	  	  case 5:
	    	System.out.println("⠀⡇⠀⠀⢸⠀⢸⠀⠀⠀⡆");
	    	break;
	  	  case 6:
	    	System.out.println("⠀⢀⠀⠀⠈⠢⠆⠀⠀⢀⣁");
	    	break;
	  	  case 7:
	    	System.out.println("⠀⠸⠀⠀⠀⠀⠀⠀⢠⠃⠀⠑⣀");
	    	break;
	  	  case 8:
	    	System.out.println("⢀⠧⠤⠤⠀⠤⢄⡀⠇⠀⠀⠸⠀⢙");
	    	break;
	  	  case 9:
	    	System.out.println("⡌⠀⠀⠀⠀⠀⠀⠈⠑⡄⢠⠃⠀⡘");
	    	break;
	  	  case 10:
	    	System.out.println("⠇⠀⠠⠒⠑⠢⠤⠤⠚⠁⠣⢄⡰");
	    	break;
	  	  case 11:
	    	System.out.println("⠰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠃");
	    	break;
	      case 12:
	    	System.out.println("⠀⠑⠤⠄⠀⠤⠠⠤⠔⠒⠁");
	    	break;
          default:
            anime = 0;
        }
        anime++;
        Thread.sleep(i);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println(e);
    }
  }
public static void pp(int i) {
    try
    {
      for(int j = 0 ; j<13; j++)
      {
        switch(anime)
        {
          case 1:
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣀");
            break;
          case 2:
            System.out.println("⠀⠀⠀⠀⢠⠒⠦ ⠀ ⡈ ⠈⠀⠀⢀⣀⡀");
            break;
          case 3:
            System.out.println("⠀⠀⠀⠀⢸⠀⠀⠃⠀ ⡇⠀⢸⠀⠀⡆⠀⢨");
            break;
	  	  case 4:
	    	System.out.println("⠀⠀⠀⠀⠸⠀⠀⢰⠀ ⡇⠀⢸⠀⢠ ⠀⡘ ⢀⠤⡀");
	    	break;
	      case 5:
	    	System.out.println("⠀⠀⠀⠀⠀⡆⠀⠸⠀ ⡇⠀⢸⠀ ⠀ ⢠ ⠎⠀⡘");
	    	break;
	  	  case 6:
	    	System.out.println("⡊⠁⠢⡀⠀⢁⠀⠀⠦⠇⠀⠸⣀⠇⠀ ⡆⡌⠀⠰⠁");
	    	break;
	      case 7:
	    	System.out.println("⠘⡀⠀⢱⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠚⠀ ⢀⠃");
	    	break;
	      case 8:
	    	System.out.println("⠀⠱⠀⠀⠒⠅⠀⢄⡀⠀⠀⠀⠀⠀⠀ ⠀ ⡌");
	    	break;
	      case 9:
	    	System.out.println("⠀⠀⢇⠀⠀⠀⠀⠀⠈⠲⡀⠀⠀⠀⠀⠀ ⠰");
	    	break;
	      case 10:
	    	System.out.println("⠀⠀⠈⢆⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠠⠁");
	    	break;
	      case 11:
	    	System.out.println("⠀⠀⠀⠀⠢⣀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠁");
	        break;
	  	  case 12:
	    	System.out.println("⠀⠀⠀⠀⠀⠀⠉⠀⠉⠒⠒⠒⠂⠉");
	    	break;
          default:
            anime = 0;
        }
        anime++;
        Thread.sleep(i);
      }
    }
    catch(InterruptedException e)
    {
      System.out.println(e);
    }
  }
  public static void cls()
  {
   	try
	{
		new ProcessBuilder("cmd.exe","/mnt/c","cls").inheritIO().start().waitFor();	
	}
	catch(Exception E)
	{
		System.out.println(E);
	}
  }
} 
