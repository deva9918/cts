class minmax
{
	public static void main(String ar[])
		{
		int swap;
		
		int []arr={60,40,10,100};
		int max=arr.length;
		for(int i=0;i<max;i++)
		{	
			for(int j=i+1;j<max;j++)
			{	
			if(arr[i]>arr[j])
			{	swap=arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
				
			}
			}
		}

		System.out.println("ascending order");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		for(int i=0;i<max;i++)
		{	
			for(int j=i+1;j<max;j++)
			{	
			if(arr[i]<arr[j])
			{	swap=arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
				
			}
			}
		}
		
		System.out.println("descending order");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		
		}
}