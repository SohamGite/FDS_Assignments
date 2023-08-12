package fds_assignments;
import java.util.*;
class Node1
{
    String data;
    Node1 next = null;
}


public class stackUsingLinklist {
static Node1 head = null;
    
    static Scanner sc = new Scanner(System.in);
    
    static Node1 create()
    {
        Node1 node = new Node1();
        System.out.println("Enter the element you want to push");
        String temp = sc.nextLine(); //written just so that line 21 runs as intended
        String element = sc.nextLine();
        node.data = element;
        node.next = null;
        return node;
    }
    
    static void push()
    {
        Node1 newnode = create();
        if(head==null)
        {
            head = newnode;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
        
    }
    
    static void pop()
    {
        if(head==null)
        {
            System.out.println("Stack does not exist");
        }
        else
        {
            Node1 temp = head;
            head = head.next;
            System.out.println("The poped element is: "+temp.data);
            temp=null;
        }
    }
    
    static void display()
    {
        if(head==null)
        {
            System.out.println("Stack does not exist");
        }
        else
        {
            Node1 temp = head;
            System.out.println("\t\tStack is:");
            while(temp!=null)
            {
                System.out.println("\t\t"+temp.data);
                temp = temp.next;
            }
        }
    }

    
	public static void main(String[] args) {
		char choice2;
		do 
	    {
			System.out.println("\n***************--------*****************");
    		System.out.println("Enter choice \n 1)Push on stack \n 2)pop \n 3)display ");
    		System.out.println("\n***************--------*****************");
    		int choice = sc.nextInt();
    		switch(choice)
    		{
    		    case 1: 
    		            push();
    		            break;
    		      
    		    case 2: pop();
    		            break;
    		            
    		    case 3:display();
    		           break;
    		           
    		    default: System.out.println("invalid input");
    		             break;
    		}
    		System.out.println("Do you want to continue? [y/n]");
			choice2 = sc.next().charAt(0);
		}while(choice2 == 'y' || choice2 == 'Y' );
	}
}
