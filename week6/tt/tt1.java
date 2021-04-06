import java.util.*;
class tt1 {
	static int i=0;
	public static void main(String[] args) {
		r();
	}
	public static void r(){
		System.out.println("Hello World!");
		i++;
		if(i<11)
		{
			r();
		}
	}
}
