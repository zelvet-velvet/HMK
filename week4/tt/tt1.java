import java.util.*;
public class tt1{
public static void main(String[] agrs){
		int[] a={2,3,1,4,8,9,0,5};
		String[] b={"Mangi","Gum","Apple","Avi"};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		StringBuffer c=new StringBuffer(Arrays.toString(a));
		c.reverse();	
		System.out.println(c);
		//
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		Collections.reverse(Arrays.asList(b));
		System.out.println(Arrays.asList(b));
	}
}












