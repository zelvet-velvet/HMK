import java.util.*;
class lab3{//1-(1/2)+(1/3)-......
	  public static void main(String[] args) {
			Scanner sb=new Scanner(System.in);
			System.out.println("Enter how many u want.:");
			double a=sb.nextInt(), b=1.0, c=0.0, i=1.0;
			while(true)
	    	{
				b=(1/i);
		        c=c+b;
		        if(i==Math.abs(a))
				{
					break;
			    }
			    if(i>0)
			    {
				    i=i*-1;
				    i--;
				}
				else if(i<0)
				{
				    i=i*-1;
				    i++;
				}
			}
			System.out.println(c);
		}
}







