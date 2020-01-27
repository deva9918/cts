class returnarray
{
static int[] get(){
		return new int[]{12,34,4654,34};
	}
	public static void main(String  ar[])
	{
		int arr[]=get();
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	
}