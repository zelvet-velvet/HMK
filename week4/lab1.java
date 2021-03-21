

import java.util.*;

class lab1{//Fibonacci
public static void main(String[] args) {
	Scanner sb=new Scanner(System.in);
	int a, c, size=0;
	System.out.println("Enter how many numbers you want:");
	size=sb.nextInt();
	if(size==0)
	{
		System.out.println("Enter need>0");	
	}
	
	
	if (size<3)
	{
		while(size==2)
		{

			System.out.println("Fibonacci from number 1 to "+size+" : ");
			System.out.println("1");
			System.out.println("1");
			break;
		}
		while(size==1)
		{

			System.out.println("Fibonacci from number 1 to "+size+" : ");
			System.out.println("1");
			break;
		}
	}
	else
	{
		int[] b =new int[size];
		b[0]=1;
		b[1]=1;


		if(size>1)
		{
			for(int i=2;i<size;i++)
			{
				b[i]=b[i-1]+b[i-2];
			}
			System.out.println("Fibonacci from number 1 to "+size+" : ");
			for(int i=0;i<size;i++)
			{
				System.out.println(b[i]);
			}
		}
	}
 }
}
























