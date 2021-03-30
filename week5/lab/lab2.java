import java.util.*;
class lab2 {
	public static void main(String[] args) {
		Scanner sb = new Scanner(System.in);
		String a=sb.nextLine();
		int u=0, l=0, d=a.length(), b=0;
	        for(int i=0; i<d;i++)
      		{
				char c=a.charAt(i);
	        	if(c>='A'&&c<='Z')
				{
					u++;	
				}
				else if(c>='a'&&c<='z')
				{
					l++;
				}
				else if(c==' ')
				{
					b++;
				}
			}
		
		System.out.println(" uppercase : "+u+" lowercase :　"+l+" digit : "+(d+b)+" space : "+b);
				
	}
}

