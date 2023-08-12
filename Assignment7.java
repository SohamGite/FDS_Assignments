package New;
import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter number of terms in array:");
		int n=sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		bubblesort(array);
		System.out.print("Sorted array is :");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		System.out.print("Enter the target element you want to search ");
		int t =sc.nextInt();
		int a =binarysearch(array,t);
		if(a==-1)
		{
			System.out.print("No such element found ");
		}
		System.out.println(a);
	}

	static void bubblesort(int[] arr)
	{
		int size = arr.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	static int binarysearch(int[] arr,int target)
	{
		int start =0;
		int end = arr.length-1;
		while(start<=end)
		{
			int mid = (start + end)/2;
			if(target<arr[mid])
			{
				end = mid -1;
			}
			else if(target > arr[mid])
			{
				start = mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
