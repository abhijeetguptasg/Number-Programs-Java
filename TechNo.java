/*print tech number :- take even digit number then separate it in two equal count of digit than add them take square of that ans if the ans and given number is same than it is tech number.*/
import java.util.Scanner;
class TechNo
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int ip =s.nextInt();
		int ans = tech(ip);
		if(ip == ans)
		{
			System.out.println("It is Tech number");
		}
		else
		{
			System.out.println("It is not Tech number");
		}
		
	}
	static int count(int num)
	{
		int count =0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	public static int tech(int num)
	{
		int ct = count(num);
		int sep =0;
		int sum =0;
		if(ct%2==0)
		{
			for(int i =1;i<=ct/2;i++)
			{
				int rem =num%10;
				sep= rem+ sep*10 ;
				num /=10;
			}
		}
		else
		{
			System.out.println("It is not valid Number");
		}
		for(int i=1;i<=ct/2;i++)
		{
			int rem = sep%10;
			sum = sum *10 +rem;
			sep/=10;
			
		}	
		int ans = num +sum;
		return ans*ans;
	}
}			
		
				
	