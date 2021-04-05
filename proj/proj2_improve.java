
import java.util.*;
import java.io.IOException;
class proj2_improve {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	static int anime=1, i=60;
	static Scanner sb= new Scanner(System.in);
  	static Random dsb=new Random();
	static int p, cmp, st;
	public static void main(String[] args) {
		cls();
		pp(i);
		cls();
		sc(i);
		cls();
		st(i);
		cls();
		while(true)
		{
    			System.out.println("Let's play a game!\nEnter paper (0), scissor (1), stone (2) !");
			state();
		}
	}
	public static void state(){
		cmp=dsb.nextInt(3);
			try
			{
				p=sb.nextInt();
				if(p>-1&&p<3)
				{
					if(p==2&&cmp==0||p==0&&cmp==2)
					{
						if(p==2&&cmp==0)
						{
							st=2;				
						}
						if(p==0&&cmp==2)
						{
							st=1;
						}		
					}
					else if(p>-1&&p<3)
					{
						if(p==cmp)
						{
							st=0;
						}
						else if(p>cmp)
						{
							st=1;
						}
						else if(cmp>p)
						{
							st=2;
						}
					}
					switch(p)
					{
						case 0:
							System.out.println("You are papper!");
							pp(i);
							break;
						case 1:
							System.out.println("You are scissor!");
							sc(i);
							break;
						case 2:
							System.out.println("You are stone!");
							st(i);
							break;	
					}
					switch(cmp)
					{
						case 0:
							System.out.println("Computer is papper!");
							pp(i);
							break;
						case 1:
							System.out.println("Computer is scissor!");
							sc(i);
							break;
						case 2:
							System.out.println("Computer is stone!");
							st(i);
							break;
					}
					switch(st)
					{
						case 0:
							System.out.println("You're tie, try again~");
							break;
						case 1:
							System.out.println("You win!");
							break;
						case 2:
							System.out.println("You lose...");
							break;
					}
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
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
            System.out.println(ANSI_RED+"⠀⠀⡠⠔⠒⠒⡖⠉⠉⠉⢢⠤⠄⣀");
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
