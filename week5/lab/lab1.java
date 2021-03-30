import java.util.*;
class lab1 {
	public static void main(String[] args) {
		Scanner sb = new Scanner(System.in);
		String a=sb.nextLine();
		int b=a.length();
		List<String> i_am_array_la=new ArrayList<String>();
		int v=0;
	        for(int i=0; i<b;i++)
      		{
				char c=a.charAt(i);
	        	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					v++;	
      				i_am_array_la.add(String.valueOf(c));
				}
			}
		
		System.out.println(v+" vowels : "+Arrays.toString(i_am_array_la.toArray()).replaceAll("\\[|\\]|,|",""));
		
	}
}

