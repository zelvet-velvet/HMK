import java.util.*;
class lab9 {
	public static void main(String[] args) {
		Scanner sb=new Scanner(System.in);
		System.out.println("(at least 8 digits, one uppercase, lowercase, number)\n password:");
		String a=sb.nextLine();
		List<Character> b=new ArrayList<>();
		int u=0, l=0, d=0;
		for(int i=0;i<a.length();i++)
		{
			b.add(a.charAt(i));
		}
		for(int i=0;i<a.length();i++)
		{
			if(b.get(i)>='A'&&b.get(i)<='Z')
			{
				u++;
			}
			else if(b.get(i)>='a'&&b.get(i)<='z')
			{
				l++;
			}
			else if(b.get(i)>='0'&&b.get(i)<='9')
			{
				d++;
			}
		}
		if(a.length()>=8&&u>0&&l>0&&d>0)
		{
			System.out.println("check passwoed:");
			String c=sb.nextLine();
			if(a.equals(c))
			{
				System.out.println("psw setting done");
			}
		}
		else
		{	
			System.out.println("plz enter at least 8 digits, uppercase*1, lowercase*1, number*1");
		}
	}
}
