
import java.util.*;
class Main{
  public static void main(String[] args){
	phonebook a=new phonebook();
	phonebook b=new phonebook();
	a.insert("Austin","0946571334");
	a.insert("Julian","0947851322");

	a.lookUp("Juli");

	b.insert("Amanda","0988881818");
	b.insert("Silvia","0945447616");
	b.insert("Ken","0954803410");
	b.insert("Silasdf","0955156548");
	
	b.lookUp("Sil");
	b.repeatLookUp("Sil");
    	
	b.delete();
	
	b.repeatLookUp("Sil");
  }
}

class phonebook{
  static int k=0, i=0;
  static LinkedList<String> nm= new LinkedList<String>();
  static LinkedList<String> ph= new LinkedList<String>();
  
  static Scanner sb=new Scanner(System.in);


  public static void  insert(String a, String b){
    nm.add(a);
    ph.add(b);
  }
  public static void delete(){
    nm.remove(k);
    ph.remove(k);
  }
  public static void lookUp(String a){
    List<Character> b=new ArrayList<>();
	int v=0;
    try
    {
      //find the match one data
      for(i=0;i<nm.size();i++)
      {
		//store each index 
        for(int l=0;l<a.length();l++)
        {
     		b.add(nm.get(i).charAt(l));     
        }
	  	if(Arrays.toString(b.toArray()).replaceAll("\\[|\\]|,|\\s|","").equals(a))
      	{
	    	dsply(i);
			b.clear();
			v++;
			k=i;
			//k is for delete()
			break; 
      	}
	  	else
	  	{
			b.clear();
			continue;	 
		}

      } 
	  if(v==0)
	  {
		  System.out.println("Not found");
	  }
	  v=0;
    }
    catch(Exception e)
    {
		System.out.println(e);
    }
  }
  public static void repeatLookUp(String a){
	 List<Character> b=new ArrayList<>();
	int v=0;
    try
    {
      //find the match one data
      for(i=0;i<nm.size();i++)
      {
		//store each index 
        for(int l=0;l<a.length();l++)
        {
     		b.add(nm.get(i).charAt(l));     
        }
	  	if(Arrays.toString(b.toArray()).replaceAll("\\[|\\]|,|\\s|","").equals(a))
      	{
	    	dsply(i);
			b.clear();
			v++;
			k=i;
			//k is for delete() 
      	}
	  	else
	  	{
			b.clear();
			continue;	 
		}

      } 
	  if(v==0)
	  {
		  System.out.println("Not found");
	  }
	  v=0;
    }
    catch(Exception e)
    {
		System.out.println(e);
    }
  }
  public static void dsply(int a){
    System.out.print(nm.get(a));
	System.out.println(" "+ph.get(a)+"\n");
  }

}
