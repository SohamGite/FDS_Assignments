package New;
import java.util.Scanner;
class Student{
	Scanner sc =new Scanner(System.in);
	int id;
	String name;
	void get_data()
	{
		System.out.println("Enter the name of student:");
		name = sc.nextLine();
		System.out.println("Enter the id of student");
		id = sc.nextInt();
	}
	void display_data(int i)
	{
		System.out.println("");
		System.out.println("\tStudent "+(i+1));
		System.out.println("\tId "+this.id);
		System.out.println("\tName "+this.name);
		System.out.println("");
	}
}

public class Assignment1 {
	static Scanner sc =new Scanner(System.in);
	static Student insert()
	{
	Student	s1 =new Student();
	s1.get_data();
	return s1;
	}
	static int delete(Student[] s1,int count)
	{	int flag =0;
		if(count==0)
		{
			System.out.println("No data available");
		}
		else
		{
			System.out.println("Enter the id of the student whose data you want to delete.");
			int id = sc.nextInt();
			for(int i=0;i<count;i++)
			{
				if(s1[i].id==id)
				{
					System.out.println("\tThe deleted data is:");
					s1[i].display_data(i);
					if(i!=(count-1))
					{
						for(int j=i;j<(count-1);j++)
						{
							s1[j]=s1[(j+1)];
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
	static void display(Student[] s1,int count)
	{
		if(count==0)
		{
			System.out.println("No data available");
		}
		else
		{System.out.println("\tThe Database is:");
			for(int i=0;i<count;i++)
			{
				s1[i].display_data(i);
			}
		}
	}
	static void search(Student[] s1,int count)
	{
		int flag=0;
		if(count==0)
		{
			System.out.println("No data available");
		}
		else
		{
			System.out.println("Enter the id of the student whos data you want to Search:");
			int id = sc.nextInt();
			for(int i=0;i<count;i++)
			{
				if(s1[i].id == id)
				{
					System.out.println("\tThe Data is:");
					s1[i].display_data(i);
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println("No data found");
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Enter number of students:");
		int count =sc.nextInt();
		Student[] student = new Student[count];
		int count2=0;
		char ch2;
		do {
			System.out.println("");
			System.out.println("Enter choice \n 1)Insert \n 2)Delete \n 3)Display \n 4)Search ");
			System.out.println("");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				count2++;
				if(count2<=count)
				{
					student[(count2-1)] = insert();
				}
				else
				{
					System.out.println("The data base is full");
					(count2)--;
				}
				break;
			case 2:
				count2 = delete(student,count2);
				break;
				
			case 3:
				display(student,count2);
				break;
			case 4:
				search(student,count2);
				
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("Do you want to continue? [y/n]");
			ch2 = sc.next().charAt(0);
			
		}while(ch2=='Y'||ch2=='y');
	}
}
