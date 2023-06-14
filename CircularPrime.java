/*check no is circular prime or not
1131-3119-9311-1931  *all rotations should be prime number */
import java.util.Scanner;
class CircularPrime
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A number");
		int num = s.nextInt();
		int temp = num, count =0;
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		int rotate =0;
		int pow =1;
		for(int i =1;i<count;i++)
		{
			pow = pow*10;
		}
		for(int i =1;i<=4;i++)
		{
			int count2 =0;
			for(int j=1; j<=num;j++)
			{
				if(num%j==0)
				{
					count2++;
				}
			}
			if (count2 !=2)
			{
				System.out.println("The no. is not circular prime no.");
				break;
			}
			else
			{
				System.out.println(num + "  Is prime number");
			}
			int rem = num %10;
			num/=10;
			rotate = rem*pow + num;
			num = rotate;
			
		}
		
	}
}
				
		