import java.util.Scanner;
class SquareRoot
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num =s.nextInt();
		
		for(int i=1;i<=num/4;i++)
		{
			if(num%i==0)
			{
				if(i*i == num)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}