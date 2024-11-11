package numberProgram;

public class KoprekarNumber {

	public static void main(String[] args) {
		
		if(isKoprekarNumber(45))
		{
			System.out.println("It is an Koprekar Number.");
		}
		else
		{
			System.out.println("It is not Koprekar Number.");
		}
	}
	public static boolean isKoprekarNumber(int num)
	{
		int square= num*num;
		String strSq= String.valueOf(square);
		
		int len= strSq.length();
		
		String left= strSq.substring(0, len/2);
		String rigth= strSq.substring(len/2);
		
		int add= Integer.parseInt(left) + Integer.parseInt(rigth);
		
		if(add == num)
		{
			return true;
		}
		
		return false;
	}
}

