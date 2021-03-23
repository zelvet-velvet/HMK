import java.util.*;
class tt3 {
  static Scanner sb =new Scanner(System.in);
  static int i=0;
  public static void main(String[] args) {
    int I=1;
    System.out.println("Welcom to 10 mini quiz!\\nEnter go to start~");
    String a=sb.nextLine();
    System.out.println("NUMBERS 1~4 GUESS one");
    if(a.equals("go"))
    {
      for(int i=0;i<11;i++)
      {
        System.out.println("Q"+I+" :");
        Q(I);
        I++;
      }
    }
    System.out.println(i+" correct!");
  }
  public static int Q(int I){
   int a, c;
   Random dsb=new Random();
   switch(I)
   {
      case 1:
        a=sb.nextInt();
        c=dsb.nextInt(4);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
      case 2:
        a=sb.nextInt();
        c=dsb.nextInt(5);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
      case 3:
        a=sb.nextInt();
        c=dsb.nextInt(5);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
      case 4:
        a=sb.nextInt();
        c=dsb.nextInt(5);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
      case 5:
        a=sb.nextInt();
        c=dsb.nextInt(5);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
      case 6:
        a=sb.nextInt();
        c=dsb.nextInt(5);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
      case 7:
        a=sb.nextInt();
        c=dsb.nextInt(5);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
      case 8:
        a=sb.nextInt();
        c=dsb.nextInt(5);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
      case 9:
        a=sb.nextInt();
        c=dsb.nextInt(5);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
      case 10:
        a=sb.nextInt();
        c=dsb.nextInt(5);
        if(a==c+1)
        {
          System.out.println("You're right! Answer is :"+(c+1));
          i++;
        }
        else
        {
          System.out.println("You're wrong! Answer is :"+(c+1));
        }
        break;
    }
    return i;
    
  }
}
