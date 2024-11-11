package numberProgram;

public class HappyNumber {

	public static void main(String[] args) {
		
		int num= 19;
		int i=0;
		while(i<100)
		{
			int sq=0;
			
			while(num !=0)
			{
				int rem= num%10;
				
				sq += rem*rem;
				
				num /=10;
			}
			
			if(sq==1)
			{
				System.out.println("It is an Happy Number.");
				break;
			}
			else if(sq==0)
			{
				System.out.println("It is not Happy Number.");
			}
			
			num= sq;
			i++;
		}
		
		if(i==100)
		{
			System.out.println("It is not Happy Number.");
		}
	}
}
