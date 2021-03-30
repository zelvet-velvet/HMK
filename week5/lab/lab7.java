import java.util.*;
class lab7 {
	public static void main(String[] args) {
		Scanner sb=new Scanner(System.in);
		String a=sb.nextLine();
		List<Character> b=new ArrayList<>();
		for(int i=a.length()-1;i>-1;i--)
		{
			b.add(a.charAt(i));
		}
	    if(Arrays.toString(b.toArray()).replaceAll("\\[|\\]|,|\\s|","").equals(a))
		{
			System.out.println(a+" is palindrome.");
		}
		else
		{
			System.out.println(a+" is not palindrome.");
		}
	}
}

