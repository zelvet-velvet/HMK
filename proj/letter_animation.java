
import java.util.*;
import java.io.IOException;
class letter_animation {
  static int anime=1;
 static Scanner sb=new Scanner(System.in); 
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
  public static void main(String args[]) 
  {
	int i =60;
	cls();
	pp(i);
	cls();
	sc(i);
	cls();
	st(i);
	cls();
	String a=sb.nextLine();
	System.out.println(a);
  }
}
