package Fds_Assignment;

import java.util.Scanner;

class Student{
	Scanner sc = new Scanner(System.in);
	String name;
	int id;
	
	void getdata() {
		System.out.println("");
		System.out.println("enter the name of students:");	
		name = sc.nextLine();
		System.out.println("enter the id of students:");	
		id = sc.nextInt();
	}
	
	void displaydata(int i) {
		System.out.println("");
		System.out.println("\t\tStudent:"+(i+1));
		System.out.println("\t\tname is: " + this.name);
		System.out.println("\t\tid is: " + this.id);
		System.out.println("");
	}
	
}
public class Array {
	
	static Scanner sc = new Scanner(System.in);
	
	static Student insert()
	{
		Student obj = new Student();
		obj.getdata();
		return obj;
	}
	
	static int delete(Student[] obj,int count)
	{
		int flag=0;
		if(count==0)
		{
			System.out.println("there is no data");
		}
		else
		{
			System.out.println("Enter the id of the student whos data you want to delete.");
			int id = sc.nextInt();
			for(int i=0;i<count;i++)
			{
				if(obj[i].id==id)
				{
					System.out.println("\t\tThe deleted data is:");
					obj[i].displaydata(i);
					if(i!=(count-1))
					{
						for(int j=i;j<(count-1);j++)
						{
							obj[j]=obj[(j+1)];
						}
					}
					flag=1;
					count--;
					break;
				}
			}
			if(flag==0)
			{
					System.out.println("There is no student with such id");
			}
		}
		return count;
		
	}
	
	static void display(Student[] obj,int count)
	{
		System.out.println("");
		if(count==0)
		{
			System.out.println("there is no data");
		}
		else
		{
			System.out.println("\t\tThe Database is:");
			System.out.println("");
			for(int i=0;i<count;i++)
			{
				obj[i].displaydata(i);
			}
		}
		
	}
	
	static void search(Student[] obj,int count)
	{
		int flag=0;
		if(count==0)
		{
			System.out.println("there is no data");
		}
		else
		{
			System.out.println("Enter the students id you want to search:");
			int id = sc.nextInt();
			for(int i=0;i<count;i++)
			{
				if(obj[i].id==id)
				{
					System.out.println("\t\tThe Data is:");
					obj[i].displaydata(i);
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
					System.out.println("There is no student with such id");
			}
		}
	}
	 
	public static void main(String arg[]) {
		
		System.out.println("enter the no of students:");
		int count = sc.nextInt();
		Student student[] = new Student[count];
		char choice2;
		int count2=0;
		do 
	    {
			System.out.println("\n***************--------*****************");
    		System.out.println("Enter choice \n 1)Insert \n 2)Delete \n 3)Display \n 4)Search ");
    		System.out.println("***************--------*****************");
    		int choice = sc.nextInt();
    		switch(choice)
    		{
    		    case 1: 
    		    	    (count2)++;
    		    	    if(count2<=count)
    		    	    {
    		    	    	student[(count2-1)] = insert();
//  		    	    	student[(count2-1)] = new Student();
//    		    	    	insert(student[(count2-1)]);
    		    	    }
    		    	    else
    		    	    {
    		    	    	System.out.println("The database is full. No 4more space (array is full)");
    		    	    	(count2)--;
    		    	    }
    		    	    break;
    		    
    		      
    		    case 2: count2 = delete(student,count2);
    		            break;
    		            
    		    case 3:display(student,count2);
    		           break;
    		           
    		    case 4:search(student,count2);
    		           break;
    		           
    		    default: System.out.println("invalid input");
    		             break;
    		}
    		System.out.println("");
    		System.out.println("Do you want to continue? [y/n]");
			choice2 = sc.next().charAt(0);
		}while(choice2 == 'y' || choice2 == 'Y' );
		
				    
	}
}
