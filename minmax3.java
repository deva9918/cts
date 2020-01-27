class minmax2
{
	public static void main(String ar[])
		{
		int []arr={60,40,10,100};
int max=arr.length;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum"+sum);
		System.out.println("avg"+sum/(max));
		
}
}