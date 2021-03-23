import java.util.*;
class tt2 {
	public static void main(String[] args) {
		int i=0;
		try
    	{
			System.out.println("Enter int, to stop enter 55688. ");
 			storeprint();
    	}
    	catch(Exception e)
    	{
			System.out.println("Only int or Only Str choose one type enter.");
    	}
    	finally
    	{
			if(i==0)
			{
				System.out.println("Try again?");
    			storeprint();
    		}
	}
}
	public static int storeprint(){
		Scanner sb=new Scanner(System.in);
		int m=0, i=0;
		String n="";
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();
		while(true)
		{	
			m=sb.nextInt();
			if(m==55688)
			{
				break;
			}
			a.add(m);
		}
    		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
    		System.out.println("Enter Str, to stop enter stop."); 
		while(true)
		{	
			n=sb.nextLine();
			if(n.equals("stop"))
			{
        			break;
			}
			b.add(n);
		}
		i=1;
    		Collections.sort(b);
		System.out.println(b);
		Collections.reverse(b);
		System.out.println(b);
		return i;
	}
}
