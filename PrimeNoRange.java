//print prime no. between range using method
import java.util.Scanner;
class PrimeNoRange
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a range : ");
		int r1=s.nextInt();
		int r2 = s.nextInt();
		primeNoInRange(r1,r2);
	}
	public static void primeNoInRange(int a, int b)
	{
		
		for(int i=a;i<=b;i++)
		{
			int count =0;
			for(int j =1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}
	