import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set 
{
  public static void main(String[] args) 
  {

	HashSet<Integer> num = new HashSet<Integer>();

    num.add(10);
    num.add(20);
    num.add(30);
	
	Iterator<Integer> itr = num.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	} 
  }
}