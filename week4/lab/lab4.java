import java.util.*;
import java.lang.*;
class lab4 {
		public static void main(String[] args) {
		  squire();
		  System.out.println(" ");
		  rightslide();
		  System.out.println(" ");
		  leftslide();
		  System.out.println(" ");
		  triangle();
		}
		public static void squire(){ //(1)
		  int i=0;
		  String [] a={"*,*,*,*,*,*,*,*,*,*"};
	      while(i<5)
	      {
	   		  System.out.println(Arrays.toString(a).replaceAll("\\[|\\]|,|\\s|",""));
		      i++;
		}
	  }
		public static void rightslide(){ //(2)
	    	int i=0, j=4, l=0;
			String [] a={"*","*","*","*","*"};
			while(i<6)
			{
				for(j=4;j>i-1;j--)
		    	{
		 			a[j]=" ";
		    	}
		    	System.out.println(Arrays.toString(a).replaceAll("\\[|\\]|,|\\s|",""));
		    	while(l<5)//to reset array a 
		    	{
		  			a[l]="*";
		        	l++;
		    	}
		    	l=0;
		    	i++;
			}
		}
		public static void leftslide(){//(3)
			int i=0, j=4, l=0;
			String [] a={"*","*","*","*","*"};
			while(i<6)
			{
			    for(j=4;j>i-1;j--)
			    {
				    a[j]=" ";
				}
				StringBuffer b=new StringBuffer(Arrays.toString(a).replaceAll("\\[|\\]|,|",""));
				b.reverse();
				System.out.println(b);
				while(l<5)//to reset array a 
				{
					a[l]="*";
					l++;
				}
				l=0;
				i++;
							
			}
		}
		public static void triangle(){
			int k=0, i=1, j=0, l=1;
			while(i<10)
			{	
				k=(9-i)/2;
				while(j<k)
				{
					System.out.print(" ");
					j++;
				}
				j=1;

				if(i==1)
				{
					System.out.print(l);
				}
				else
				{
					while(j<i+1)
					{
						System.out.print(l);
						j++;
					}
				}
				j=0;
				i+=2;
				l++;
				System.out.println("");
			}
		}
}








