import java.util.*;
class lab10 {
	static double t=0;
	public static void main(String[] args) {
		Scanner sb =new Scanner(System.in);
		System.out.println("Enter exchange rate");
		double r=sb.nextDouble();
		System.out.println("Enter \n  1 --> NTDtoUSD\n  0 --> USDtoNTD");
		int e=0;
		e=sb.nextInt();
		System.out.println("Enter how much: ");
		double d=sb.nextDouble();
		switch(e)
		{
			case 1:
				t=d/r;
				System.out.println("USD : "+t);
				break;
			case 0:
				t=d*r;
				System.out.println("NTD : "+t);
				break;
			default:
				System.out.println("nope");
				break;
		}
	}
}
