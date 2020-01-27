class minmax2
{
	public static void main(String ar[])
		{
		int []arr={60,40,10,100};
		int min=arr[0];
		int  max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			min=arr[i];
		}
		System.out.println("minimum"+min);
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]>max)
			max=arr[j];
		}
		System.out.println("maximum"+max);
		
}
}