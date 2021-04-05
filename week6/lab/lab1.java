import java.util.*;
class lab1 {
	static Scanner sb=new Scanner(System.in);
	
	// a is input, b is blank List.
	static String a=sb.nextLine();
	static List<Character> b=new ArrayList<>();


	// Create a class constructor for the lab1 class
	// (class constructor can't hava return type)
	public lab1(){// store the input from the last char to first
		for(int i=a.length()-1;i>-1;i--)
		{
			b.add(a.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		lab1 a=new lab1();// Create an object of class lab1(It will call the constructor)
		// print it the List out
		System.out.println(Arrays.toString(a.b.toArray()).replaceAll("\\[|\\]|,|\\s|",""));
	}
	
}


