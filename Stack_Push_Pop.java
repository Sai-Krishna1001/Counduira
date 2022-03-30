import java.util.*;
class Stack_Push_Pop
{
	public static void main(String args[])
	{
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("Stack elements : ");
		for(int i = 1;i<=6;i++)
		{
			st.push(i);
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Removing elements : ");
		for(int i = 1;i<=2;i++)
		{
			Integer x = (Integer) st.pop();
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Existing elements : ");
		System.out.println(st);
	}
}
			
		