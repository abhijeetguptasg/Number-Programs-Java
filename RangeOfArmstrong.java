import java.util.Scanner;
class RangeOfArmstrong
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a two number");
		int start = s.nextInt();
		int end =s.nextInt();
		for(int i = start; i<=end;i++)
		{
			if(armStrong(i))
			{
				System.out.println(i);
			}
		}
		
	}
	public static int count(int num)
	{
		int ct =0;
		while(num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int raise, int base)
	{
		int pow=1;
		for(int i=1;i<=raise;i++)
		{
			pow *=base;
		}
		return pow;
	}
	public static boolean armStrong(int n)
	{
		int sum =0;
		int count =count(n);
		for(int i =n;i!=0;i/=10)
		{
			int rem = i%10;
			sum = sum + power(count,rem);
		}
		if(sum ==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}