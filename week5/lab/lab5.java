import java.util.*;
class lab5 {
	public static void main(String[] args) {
		Scanner sb=new Scanner(System.in);
		String a=sb.nextLine();
		List<Character> b=new ArrayList<>();
		for(int i=1;i<a.length();i++)
		{
			b.add(a.charAt(i));
		}
		b.add(a.charAt(0));
		System.out.println(Arrays.toString(b.toArray()).replaceAll("\\[|\\]|,|\\s|",""));
	}
}
