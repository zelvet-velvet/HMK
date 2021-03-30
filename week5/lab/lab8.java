import java.util.*;
class lab8 {
	public static void main(String[] args) {
		Scanner sb=new Scanner(System.in);
		String a=sb.nextLine();
		List<Character> b=new ArrayList<>();
		for(int i=0;i<a.length();i++)
		{
			b.add(a.charAt(i));
		}
		for(int i=0;i<a.length()+1;i++)
		{
			System.out.println(Arrays.toString(b.toArray()).replaceAll("\\[|\\]|,|\\s|",""));
			b.add(a.length(),b.get(0));
			b.remove(0);
		}

	}
}
