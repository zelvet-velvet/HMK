import java.util.*;
class lab4 {
	public static void main(String[] args) {
		Scanner sb=new Scanner(System.in);
		String a=sb.nextLine();
		List<Character> b=new ArrayList<>();
		for(int i=a.length()-1;i>-1;i--)
		{
			b.add(a.charAt(i));
		}
		System.out.println(Arrays.toString(b.toArray()).replaceAll("\\[|\\]|,|\\s|",""));
	}
}
