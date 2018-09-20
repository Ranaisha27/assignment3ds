import java.util.*;
class Search {

	public static boolean search(int arr[],int num)
	{
		if(arr.length==0)
		{
			return false;
		}
		int smallArray[]=new int[arr.length-1];
		for(int i=0;i<smallArray.length;i++)
		{
			smallArray[i]=arr[i+1];
		}
		boolean smallAns=search(smallArray,num);
		if(smallAns)
		{
			return true;
		}
		else
		{
			if(arr[0]==num)
			{
				return true;
			}
			else 
				return search(smallArray,num);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,m;
		System.out.print("ENTER SIZE:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("ENTER ARRAY:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("ENTER ELEMENT TO BE SEARCHED:");
		m=sc.nextInt();
	        System.out.println(search(arr,m));
		
	}

}