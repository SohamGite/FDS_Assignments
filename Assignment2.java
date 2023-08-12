package fds_assignments;
import java.util.Scanner;

public class SparseTranspose {
	Scanner sc = new Scanner(System.in);
	public void entermatrix(int row, int col,int b[][]) {
		System.out.println("enter the lements of the matrix row wise");
		for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++)
            {
            	b[i][j] = sc.nextInt();
            }
		}
	}
	
	public void displaymatrix(int row , int col, int b[][]) {
		for(int i=0; i<row; i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" " + b[i][j]);
			}
			System.out.println();
		}
	}
	
	public void convert(int row, int col,int a[][], int b[][]) {
		int counter=0;
		for(int i=0; i<row; i++) 
		{
            for(int j=0; j<col; j++)
            {
            	if(a[i][j]!=0) 
            	{
            		counter++;
            	}
            }
		}
		b[0][0] = row;
		b[0][1] = col;
		b[0][2] = counter;
		int k=1;
		for(int l=0; l<row; l++)
			for(int m=0;m<col; m++)
			{
				if(a[l][m]!=0)
				{
					b[k][0]=l;
					b[k][1]=m;
					b[k][2]=a[l][m];
					k++;
				}
			}
	}
	
	public void simpletranspose(int b[][],int c[][])
	{
		int col = b[0][1];
		int elements = b[0][2];
		c[0][0]=b[0][1];
		c[0][1]=b[0][0];
		c[0][2]=b[0][2];
		int k=1;
		for(int i=0; i<col;i++)
		{
			for(int j=1; j<=elements;j++)
			{
				if(b[j][1]==i)
				{
					c[k][0]=b[j][1];
					c[k][1]=b[j][0];
					c[k][2]=b[j][2];
					k++;
				}
			}
		}
	}
	
	public void fasttranspose(int b[][],int d[][])
	{
		int col,element;
		col = b[0][1];
		element = b[0][2];
		int row[] = new int[(col)];
		int start_position[] = new int[(col)];
		for(int i=0;i<col;i++)
		{
			row[i] = 0;
			start_position[i] = 0;
		}
		for(int j=1;j<=element;j++)
		{
			row[(b[j][1])]++;
		}
		start_position[0] = 1;
		for(int l=1;l<col;l++)
		{
			start_position[l] = start_position[(l-1)] + row[(l-1)]; 
		}
		d[0][0] = b[0][1];
		d[0][1] = b[0][0];
		d[0][2] = b[0][2];
		for(int m=1; m<=element; m++)
		{
			int n= start_position[b[m][1]];
			d[n][0] = b[m][1];
			d[n][1] = b[m][0];
			d[n][2] = b[m][2];
			start_position[b[m][1]]++;
		}
		
	}
    
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		SparseTranspose m1 = new SparseTranspose();
		int counter;
		int row,col;
		int a[][] = new int[10][10];    //normal matrix
		int b[][] = new int[10][10];    //sparse matrix
		int c[][] = new int[10][10];    //simple transpose
		int d[][] = new int [10][10];   //fast transpose
		System.out.println("enter the no of rows");
        row = sc.nextInt();
        System.out.println("enter the no of col");
        col = sc.nextInt();
        char choice2;
        do
        {
        	System.out.println("\n***************--------*****************");
        	System.out.println("1)enter the matrix\n2)convert to sparse\n3)simple transpose\n4)fast transpose\n");
        	System.out.println("\n***************--------*****************");
        	System.out.println("enter ur choice");
    		int choice1 = sc.nextInt();
    		switch(choice1) 
    		{
    		case 1:
    	           m1.entermatrix(row,col,a);
    	           System.out.println("The normal matrix is:");
    	           m1.displaymatrix(row,col,a);
    	           break;
    	    
    		case 2:
    	    	   m1.convert(row,col,a,b);
    	    	   System.out.println("the sparse matrix is:");
    	    	   row = b[0][2] + 1;
    	    	   m1.displaymatrix(row,3,b);	          
    	           break;

    	    case 3:
    	           m1.simpletranspose(b,c);
    	           System.out.println("the simple transpose of sparse matrix is:");
    	           row = c[0][2] + 1;
    	           m1.displaymatrix(row,3,c);
    	           break;
    	    
    	    case 4:
    	           m1.fasttranspose(b,d);
    	           System.out.println("fast transpose is:");
    	           row = d[0][2] + 1;
    	           m1.displaymatrix(row,3,d);
    	           break;
    	           
    	    default:
    	            System.out.println("incorrect option");
    	            break;
    		}
    		System.out.println("Do you want to continue? [y/n]");
    		choice2 = sc.next().charAt(0);		
        }while(choice2 == 'y'|| choice2 == 'Y');
	} 
}
