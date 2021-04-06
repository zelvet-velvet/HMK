import java.util.*;
class tt2 {
	static Scanner sb=new Scanner(System.in);
	static String a=sb.nextLine();
	static int i=a.length()-1;
	static List<Character> b=new ArrayList<>();
	public static void main(String[] args) {
		r();
		//if input epuals to reverse input(o) 
		//vice versa (x)
		if(Arrays.toString(b.toArray()).replaceAll("\\[|\\]|,|\\s|","").equals(a))
		{
			System.out.println(a+" is palindrome.");
		}
		else
		{
			System.out.println(a+" is not palindrome.");
		}
	}
	//reverse input with List
	public static void r(){
		b.add(a.charAt(i));
		i--;
		if(i>-1)
		{
			r();
		}
	}
}
