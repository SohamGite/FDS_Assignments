package Fds_Assignment;


import java.util.Scanner;



class Node{
	int id;
	String name;
	Node next;
}

public class Linkedlist {
	static Scanner sc = new Scanner(System.in); //remember you have to use static
	static Node head = null ;                   //remember you have to use static to use in other methods
	
	static Node create() {
		Node node = new Node();
		System.out.println("Enter the id:");
		node.id = sc.nextInt();
		System.out.println("Enter the name:");
		String temp = sc.nextLine(); //written so next line runs as intended
 		node.name = sc.nextLine();
		node.next = null;
		return node;
	}

	static void insertAtEnd() {
		Node newnode = create();
		if(head==null) {
			head = newnode;
		}
		else 
		{
			Node temp = head;
			while(temp.next!=null) {
			temp=temp.next;	
		}
		temp.next = newnode; 
		}
	}
	
	static void insertAtBeg() {
		Node newnode = create();
		if(head==null) {
			head = newnode;
		}else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	static void insertAny() {
		if(head==null) {
			System.out.println("Link-list does not exist");
		}
		else 
		{
			System.out.println("Enter the index at which you want to insert (!!*Note:Nodes start from index 1*!!)");
			int index = sc.nextInt();
			int i=0;
			Node temp=head; 
			if(index==1)   //written if user chooses to add node at first position.
			{
				Node newnode = create();
				newnode.next = head;
				head = newnode;
			}
			else if(index==0)
			{
				System.out.println("Invalid input. Nodes start from index 1.");
			}
			else
			{
				 while(i<(index-2) && temp!=null) 
					{
						temp=temp.next;
						i++;
					}  
					if(temp==null) {
						System.out.println("Overflow");
					}
					else 
					{
						Node newnode = create();
						newnode.next = temp.next;
						temp.next = newnode;
					}
			}
		}
	}
	
	static void display() {
		if(head==null) {
			System.out.println("Link-list does not exist");
		}
		else
		{
				Node temp = head;
				System.out.println("Link-list is:");
				System.out.println("\t Id \t Name");
				while(temp!=null) {
					System.out.println("\t" + temp.id + "\t" + temp.name);
					temp=temp.next;
			}
				System.out.println("");
		}
	}
	
	static void deleteFirst() {
		if(head==null) {
			System.out.println("Link-list does not exist");
		}
		else
		{
			Node temp = head;
			head = head.next;
			System.out.println("The data of deleted node is:");
			System.out.println("\tId\tName");
			System.out.println("\t" + temp.id + "\t" + temp.name);
			temp = null;
		}
	}
	
	static void deleteLast() {
		if(head==null) {
			System.out.println("Link-list does not exist");
		}
		else
		{
			Node temp1 = head;
			Node temp2 = null;
			while(temp1.next!=null)
			{
				temp2=temp1;
				temp1=temp1.next;
			}
			System.out.println("The data of deleted node is:");
			System.out.println("\tId\tName");
			System.out.println("\t" + temp1.id + "\t" + temp1.name);
			temp2.next = null;
			temp1 = null;
		}
	}
	
	static void deleteAny()
	{
		if(head==null) {
			System.out.println("Link-list does not exist");
		}
		else
		{
			Node temp1 = head;
			Node temp2 = null;
			System.out.println("enter the id you want to delete");
			int id = sc.nextInt();
			while(temp1!=null && temp1.id!=id)
			{
				temp2=temp1;
				temp1=temp1.next;
			}
			if(temp1==null) 
			{
				System.out.println("There is no node with such data element");
			}
			else
			{
				if(temp2==null)                       //this is used so that if user give the id that is in the first node. if this is not written then temp2 remains null and we get an error
				{
					head=head.next;
				}
				else
				{
					temp2.next=temp1.next;	
				}
				System.out.println("The data of deleted node is:");
				System.out.println("\tId\tName");
				System.out.println("\t" + temp1.id + "\t" + temp1.name);
				temp1=null;
			}
		}
	}
	
	static void search()
	{
		if(head==null) {
			System.out.println("Link-list does not exist");
		}
		else
		{
			Node temp = head;
			System.out.println("Enter the id you want to search");
			int id = sc.nextInt();
			while(temp!=null && temp.id!=id)
				
			{
				temp=temp.next;

			}
			if(temp==null) 
			{
				System.out.println("There is no such node");
			}
			else
			{
				System.out.println("The data of searched node is:");
				System.out.println("\tId\tName");
				System.out.println("\t" + temp.id + "\t" + temp.name);
			}
		}
	}
	
	static void modify()
	{
		if(head==null) {
			System.out.println("Link-list does not exist");
		}
		else
		{
			Node temp = head;
			System.out.println("Enter the id you want to modify");
			int id = sc.nextInt();
			while(temp!=null && temp.id!=id)
			{
				temp=temp.next;
			}
			if(temp==null) 
			{
				System.out.println("There is no such node");
			}
			else
			{
				System.out.println("Enter modified id:");
				temp.id = sc.nextInt();
				System.out.println("Enter modified name:");
				String temps1 = sc.nextLine();         //written so  next line runs as intended
				temp.name = sc.nextLine();
				System.out.println("Data modified");
			}
		}
	}
    
	static public void main(String args[]) {
		
		char choice2;
		do {
			System.out.println("\n***************--------*****************");
			System.out.println("\nThe following operations can be performed: "
					          + "\n 1.Insert at end "
					          + "\n 2.Insert at begining "
					          + "\n 3.Insert at given index "
					          + "\n 4.Display "
					          + "\n 5.Delete first "
					          + "\n 6.Delete last "
					          + "\n 7.Delete any "
					          + "\n 8.search "
					          + "\n 9.modify");
			System.out.println("\n ***************--------*****************");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: insertAtEnd();
			        break;
			       
			case 2: insertAtBeg(); 
			        break;
			        
			case 3: insertAny();
			        break;
			 
			case 4: display();
			        break;
			        
			case 5: deleteFirst();
	                break;
	                
			case 6: deleteLast();
                    break;
                    
			case 7: deleteAny();
                    break;
            
			case 8: search();
                    break;
            
			case 9: modify();
                    break;
			        
			default: System.out.println("invalid input");
			         break;
			}
			System.out.println("Do you want to continue? [y/n]");
			choice2 = sc.next().charAt(0);
		}while(choice2 == 'y' || choice2 == 'Y' );	
	}
}

