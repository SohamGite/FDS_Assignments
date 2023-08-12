package New;
import java.util.Scanner;
class Node1{
	int data;
	Node1 next;
	Node1(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class Assignment3 {
static Scanner sc=new Scanner(System.in);
static Node1 top= null;
static void push(int a)
{
	Node1 temp=new Node1(a);
	if(top==null)
	{
		top=temp;
	}
	else
	{
		temp.next=top;
		top=temp;
	}
	System.out.println(temp.data +" pushed into the stack");
}
static int pop()
{
Node1 temp=top;
if(top!=null)
{
	top=top.next;
	System.out.println("The poped element is "+temp.data);
	temp=null;
	return 1;
}
else
{
	System.out.println("Stack is Empty");	
	return 0;
}
}
static void display()
{
Node1 temp=top;
if(top==null)
{
	System.out.println("Stack is Empty");
}
else
{
	System.out.println("Stack is");
while(temp!=null)
{
	System.out.println(temp.data);
	temp=temp.next;
}
}
}
public static void main(String[] args)
{	
	boolean cont=true;
while(cont)
{
	System.out.println("Enter your choice:");
	System.out.println("1:PUSH");
	System.out.println("2:POP");
	System.out.println("3:Display");
	System.out.println("4:Exit");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("Enter element to be pushed:");
		int d=sc.nextInt();
		push(d);
		break;
	case 2:
		pop();
		break;
	case 3:
		display();
		break;
	case 4:
		cont=false;
		break;
	default:
		System.out.println("Invalid input");
		break;
	}
	 
}
}
}
