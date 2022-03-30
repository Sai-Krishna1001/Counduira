import java.util.*;
class Queue_Enq_Deq
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println("Queue elements : ");
		for(int i = 1;i<=6;i++)
		{
			q.add(i);
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Removing elements : ");
		for(int i = 1;i<=2;i++)
		{
			Integer x = (Integer) q.remove();
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Existing elements : ");
		System.out.println(q);
	}
}
			
		