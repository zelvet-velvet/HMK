import java.util.*;
class lab3 {
	public static void main(String[] args) {
		Scanner sb=new Scanner(System.in);
		String a=sb.nextLine();
		List<Character> b=new ArrayList<>();
		for(int i=0;i<a.length();i++)
		{
			b.add(a.charAt(i));
		}
		char c=b.get(0);
		char d=b.get(a.length()-1);
		b.set(0,d);
		b.set(a.length()-1,c);
		System.out.println(Arrays.toString(b.toArray()).replaceAll("\\[|\\]|,|\\s|",""));
	}
}


