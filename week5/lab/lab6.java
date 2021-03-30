import java.util.*;
class lab6{
public static void main(String[] args){
		Scanner sb=new Scanner(System.in);
		String a=sb.nextLine();
		String b[]=a.split( " ",3);
		String c;
		b[0]=String.valueOf(b[0].charAt(0));
		b[1]=String.valueOf(b[1].charAt(0));
		b[2]=String.valueOf(b[2].charAt(0));
		for(int i=0;i<3;i++)
		{
			System.out.print(b[i]+". ");	
		}
		System.out.println(" ");
	}
}
