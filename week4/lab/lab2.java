import java.util.*;
class lab2 {// i/i!
	  public static void main(String[] args) {
	      double a, f=1, c=0, h=0, j=1;
	      Scanner sb= new Scanner(System.in);
	      a=sb.nextInt();
	      for(int i=1;i<a+1;i++)
	      {
	      	 while(j<i+1)
	      	{
	        	 f=f*j;
	         	j++;
	      	}
	      	c=(i/f);
  		 	 h=h+c;
	      	c=0;
          }
	      System.out.println(h);
	  }
}







































