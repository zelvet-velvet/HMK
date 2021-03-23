import java.util.*;
class lab4 {
  public static void main(String[] args) {
    squire();
    System.out.println(" ");
    rightslide();
    System.out.println(" ");
    leftslide();
    System.out.println(" ");
    triangle();
    System.out.println(" ");
    numsbyfloortriangle();
    System.out.println(" ");
    numstriangle();
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

  public static void leftslide(){
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
			int k=0, i=1, j=0;
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
					System.out.print("*");
				}
				else
				{
					while(j<i+1)
					{
						System.out.print("*");
						j++;
					}
				}
				j=0;
				i+=2;
				System.out.println("");
			}
  }
  public static void numsbyfloortriangle(){
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
  public static void numstriangle(){
    int k=0, i=1, j=0, l=1, p, q=1;
		while(i<10)
		{	
			k=(9-i)/2;
			while(j<k)
			{
				System.out.print(" ");
				j++;
			}
			j=0;
				if(i==1)
			{
				System.out.print("1");
			}
			else
			{ 
			  p=q;
			  while(j<i)
			  {
			    if(j<=((i/2)-1))
			    { 
			      if(p==1)
			      {
			   	    System.out.print(p);
			   	    p++;
			      }
			      else if(p!=1)
			      {
			        System.out.print(p);
			   	    p--;
			      }
			    }
			    else if(j>((i/2)-1))
			    {
			      System.out.print(p);
			      p++;
			    }
			    j++;
				}
			}
			j=0;
			i+=2;
			l++;
			q++;
			System.out.println("");
		} 
  }
}
