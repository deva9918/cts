import java.util.*;
class mul
{
	public static void main(String ar[])
		{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a1[][]=new int[n][n];
		int a2[][]=new int[n][n];
		int a3[][]=new int[n][n];
		System.out.println("enter the elements in 1st array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a1[i][j]=s.nextInt();
			}
		}
		System.out.println("enter the elements in 2st array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a2[i][j]=s.nextInt();
			}
		}

		for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
					{
					for(int k=0;k<n;k++)
						{
						a3[i][j]=a3[i][j]+a1[i][k]*a2[k][j];
						}
					}
			}
		System.out.println("the elements in 3rd array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a3[i][j]+"\n");
			}
			System.out.println();
		}
			
	}
}		