package New;
import java.util.Scanner;
public class Circularqueue {
	static int front =-1,rear=-1,count=0;
	static int size=5;
	static int[] order = new int[size];
	Circularqueue()
	{
		front=rear-1;
	}
	static boolean insert(int a)
	{
		if(rear==-1)
		{
			front=rear=0;
			order[rear]=a;
			return true;		
		}
		else
		{
			int pos = (rear+1)%size;
			if(pos==front)
			{
				System.out.println("The restraunt is full");
				return false;
			}
			else
			{	rear=pos;
				order[rear]=a;
				return true;
			}
		}
	}
	static void deque()
	{
		if(front==-1)
		{
			System.out.println("The restaunt is empty");
			return;
		}
		else
		{
			System.out.println("The order "+order[front]+ " is ready");
			if(front==rear)
			{
				front=rear=-1;
			}
			else
			{
				front=(front+1)%size;
			}
		}
	}
	static void display()
	{
		if(front==-1)
		{
			System.out.println("The restraunt is empty");
		}
		else
		{
			System.out.println("Pending orders are:");
			for(int i=front;i!=rear;i=(i+1)%size)
			{
				System.out.println(order[i]+" ");
			}System.out.println(order[rear]);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int id=0,ch;
		Circularqueue q =new Circularqueue();
		do
		{	System.out.println("\n\n\n------------------------\n PIZZA MANIA\n------------------------\n");
			System.out.println("\n*Menu\n1. Accept order\n2. Serve order\n3. Display orders\n4. Exit");
			System.out.println("\nChoice: ");
			ch=sc.nextInt();
			switch (ch)
			{
			case 1:
				id++;
				q.insert(id);
				System.out.println("New order recieved");
				break;
			case 2:
				q.deque();
				break;
			case 3:
				q.display();
				break;
			}
	}while(ch!=4);
	System.out.println("\nThank You.Keep Visiting.");	
	}
}