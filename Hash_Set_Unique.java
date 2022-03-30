import java.util.HashSet;
class Hash_Set_Unique
{
	public static void main(String args[])
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(3);
		hs.add(6);
		hs.add(9);
		for(int i = 1;i<=10;i++)
		{
			if(hs.contains(i))
			{
				continue;
			}
			else
			{
				hs.add(i);
			}
		}
		System.out.println(hs);
	}
}