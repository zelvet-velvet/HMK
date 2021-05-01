import java.util.*;
import java.io.IOException;
import java.lang.*;
class proj3 {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RESET = "\u001B[0m";

	static Scanner sb= new Scanner(System.in);

	//beneath is the board to display
	static String a=" 1 | 2 | 3 ";
	static String b=" 4 | 5 | 6 ";
	static String c=" 7 | 8 | 9 ";

	//to store what position ply1&ply2 choose
	//can identify if player choose the same position & player win or not
	static List<String>ply1=new ArrayList<>();
	static List<String>ply2=new ArrayList<>();

	//String j is the input from user(choose position from board)  
	static String j;

	//8 bolean used to identify if player win
	static boolean w1=false, w2=false, w3=false, w4=false, w5=false, w6=false, w7=false, w8=false;

	//if w=1 means someone win
	static int w=0;

	//
	static boolean dsb, rpt=false;

	
	static int anime;

	public static void main(String[] args) {
		cls();
		bd(120);
		cls();
		gamebody();
	}
	public static void gamebody(){
		int k=0;
		while(k<9){
			dsb=true;
			if(k%2==0)
			{
				cls();
				System.out.println(ANSI_GREEN+"Player1(o)"+ANSI_RESET+"  -  "+ANSI_YELLOW+"Player2(x)"+ANSI_RESET);
				disply();
				while(dsb)
				{
					rpt=false;
					System.out.println(ANSI_GREEN+"(x)Player1's turn."+ANSI_RESET);
					System.out.print("Enter 1~9:");
					j=sb.nextLine();
					checkrpt(j);
					if(rpt)
					{
						cls();
						disply();
						System.out.println("You choose a place which has been chosen.\nChoose another one.\nor\nYou entered a wrong onput.\nEnter again.");
						continue;
					}
					else
					{
						dsb=false;
					}
				}
				change1(j);
				ply1.add(j);
				ply1win();
				if(w==1)
				{
					cls();
					disply();
					System.out.println("Congratulations!\n Player 1(x) win the game!");
					break;
				}
			}
			else
			{
				cls();
				System.out.println(ANSI_GREEN+"Player1(o)"+ANSI_RESET+"  -  "+ANSI_YELLOW+"Player2(x)"+ANSI_RESET);
				disply();
				while(dsb)
				{
					rpt=false;
					System.out.println(ANSI_YELLOW+"(o)Player2's turn."+ANSI_RESET);
					System.out.print("Enter 1~9:");
					j=sb.nextLine();
					checkrpt(j);
					if(rpt)
					{
						cls();
						System.out.println(ANSI_GREEN+"Player1(o)"+ANSI_RESET+"  -  "+ANSI_YELLOW+"Player2(x)"+ANSI_RESET);
						disply();
						disply();
						System.out.println("You choose a place has been chosen.\nEnter another one.");
						continue;
					}
					else
					{
						dsb=false;
					}
				}
				change2(j);
				ply2.add(j);
				ply2win();
				if(w==1)
				{
					cls();
					System.out.println(ANSI_GREEN+"Player1(o)"+ANSI_RESET+"  -  "+ANSI_YELLOW+"Player2(x)"+ANSI_RESET);
				disply();
					disply();
					System.out.println("A toast to player 2(o)!\n You win the game!");
					break;
				}

			}
			k++;
		}
		System.out.println("Game overThis game ended in a tie~!"); 
	}
	public static void change1(String i){
		a=a.replaceAll(i,"x");
		b=b.replaceAll(i,"x");
		c=c.replaceAll(i,"x");
	}
	public static void change2(String i){
		a=a.replaceAll(i,"o");
		b=b.replaceAll(i,"o");
		c=c.replaceAll(i,"o");
	}
	public static void disply(){
		System.out.println("   "+"|"+"   "+"|"+"   ");
		System.out.println(a);
		System.out.println("   "+"|"+"   "+"|"+"   ");
		System.out.println("--- "+"--- "+"---");
		System.out.println("   "+"|"+"   "+"|"+"   ");
		System.out.println(b);
		System.out.println("   "+"|"+"   "+"|"+"   ");
		System.out.println("--- "+"--- "+"---");
		System.out.println("   "+"|"+"   "+"|"+"   ");
		System.out.println(c);
		System.out.println("   "+"|"+"   "+"|"+"   ");
	}	
	//this method is to identify whether player1 or 2 win or not
	//I want to store the position each time player enter to list 
	//and check the index of the list have 123 or 147 or.....
	//but I have no idea now 
	public static void ply1win(){
		w1=(ply1.contains("1")&&ply1.contains("2")&&ply1.contains("3"));
		w2=(ply1.contains("4")&&ply1.contains("6")&&ply1.contains("5"));
		w3=(ply1.contains("7")&&ply1.contains("8")&&ply1.contains("9"));
		w4=(ply1.contains("7")&&ply1.contains("4")&&ply1.contains("1"));
		w5=(ply1.contains("8")&&ply1.contains("5")&&ply1.contains("2"));
		w6=(ply1.contains("9")&&ply1.contains("6")&&ply1.contains("3"));
		w7=(ply1.contains("1")&&ply1.contains("5")&&ply1.contains("9"));
		w8=(ply1.contains("3")&&ply1.contains("5")&&ply1.contains("7"));
		if(w1)
		{
			w=1;
		}
		if(w2)
		{
			w=1;
		}
		if(w3)
		{
			w=1;
		}
		if(w4)
		{
			w=1;
		}
		if(w5)
		{
			w=1;
		}
		if(w6)
		{
			w=1;
		}
		if(w7)
		{
		
			w=1;
		}
		if(w8)
		{
			w=1;
		}
	}
	public static void ply2win(){
		w1=(ply2.contains("1")&&ply2.contains("2")&&ply2.contains("3"));
		w2=(ply2.contains("4")&&ply2.contains("6")&&ply2.contains("5"));
		w3=(ply2.contains("7")&&ply2.contains("8")&&ply2.contains("9"));
		w4=(ply2.contains("7")&&ply2.contains("4")&&ply2.contains("1"));
		w5=(ply2.contains("8")&&ply2.contains("5")&&ply2.contains("2"));
		w6=(ply2.contains("9")&&ply2.contains("6")&&ply2.contains("3"));
		w7=(ply2.contains("1")&&ply2.contains("5")&&ply2.contains("9"));
		w8=(ply2.contains("3")&&ply2.contains("5")&&ply2.contains("7"));
		if(w1)
		{
			w=1;
		}
		if(w2)
		{
			w=1;
		}
		if(w3)
		{
			w=1;
		}
		if(w4)
		{
			w=1;
		}
		if(w5)
		{
			w=1;
		}
		if(w6)
		{
			w=1;
		}
		if(w7)
		{
		
			w=1;
		}
		if(w8)
		{
			w=1;
		}
	}
	public static void checkrpt(String j){
		if(j.equals("1")||j.equals("2")||j.equals("3")||j.equals("4")||j.equals("5")||j.equals("6")||j.equals("7")||j.equals("8")||j.equals("9"))
		{
			for(String i: ply1)
			{
				if(j.equals(i))
				{
					rpt=true;
				}
			}
			for(String i: ply2)
			{
				if(j.equals(i))
				{
					rpt=true;
				}
			}
		}
		else
		{
			rpt=true;
		}
	}
	public static void bd(int i) {
    		try
    		{
      			for(int j = 0 ; j<18; j++)
      			{
        			switch(anime)
        			{
          				case 1:
						System.out.println("  ⢀⣠⠤⠦⢤⡀⠀⠀ |              |⠀ ⠀⣄⠀⠀⠀⠀⣠⡄⠀  ");
						break;
					case 2:
						System.out.println("⠀⢠⠋⠀⠀⠀⠀⠈⢢⠀ |              |⠀ ⠀⠈⠳⢄⣠⡾⠋⠀⠀ ");
						break;
					case 3:
						System.out.println("⠀⢸⠀⠀⠀⠀⠀⠀⢸⡇  |             |⠀⠀ ⠀⣀⡼⠻⣄⠀⠀⠀  ");
						break;
					case 4:
						System.out.println("⠀⠸⣄⠀⠀⠀⠀⢀⡼⠀  |             |⠀ ⠠⠾⠋⠀⠀⠈⠳⠄⠀ ");
						break;
					case 5:
						System.out.println("⠀⠀⠈⠓⠶⠶⠖⠋   |              |             ");
						break;
					case 6:
						System.out.println("------------|--------------------------");
						break;
					case 7:
						System.out.println("  ⢀⣠⠤⠦⢤⡀⠀⠀⠀|   ⢀⣠⠤⠦⢤⡀⠀⠀ ⠀|");
						break;
					case 8:
						System.out.println("⠀⢠⠋⠀⠀⠀⠀⠈⢢⠀ |⠀ ⢠⠋⠀⠀⠀⠀ ⠈⢢⠀ |");
						break;
					case 9:
						System.out.println("⠀⢸⠀⠀⠀⠀⠀⠀⢸⡇⠀|  ⢸⠀⠀⠀⠀⠀⠀ ⢸⡇⠀|");
						break;
					case 10:
						System.out.println("⠀⠸⣄⠀⠀⠀⠀⢀⡼⠀ |  ⠸⣄⠀⠀⠀⠀ ⢀⡼⠀ |");
						break;
					case 11:
						System.out.println("⠀⠀⠈⠓⠶⠶⠖⠋   |⠀  ⠈⠓⠶⠶⠖⠋    |");
						break;
					case 12:
						System.out.println("------------|--------------------------");
						break;
					case 13:
						System.out.println("            |⠀ ⠀⣄⠀⠀⠀⠀⣠⡄⠀  |");
						break;
					case 14:
						System.out.println("            |⠀ ⠀⠈⠳⢄⣠⡾⠋⠀⠀  |");
						break;
					case 15:
						System.out.println("            |⠀⠀ ⠀⣀⡼⠻⣄⠀⠀⠀  |");
						break;
					case 16:
						System.out.println("            |⠀ ⠠⠾⠋⠀⠀⠈⠳⠄⠀  |");
						break;
					case 17:
						System.out.println("            |             |");
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
			//("cmd.exe","yourpath","cls")
			new ProcessBuilder("cmd.exe","/mnt/c","cls").inheritIO().start().waitFor();	
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
  	}
}



