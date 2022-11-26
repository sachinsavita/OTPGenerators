import java.util.Random;
import java.util.SplittableRandom;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("OTP 1: "+Application.generateOTP1(6));
		System.out.println("OTP 2: "+Application.generateOTP2());

	}
	
	public static String generateOTP1(int otpLength)
	{
		
		//Difference between Random and SplittableRandom
		//Using SplittableRandom we can defin between what digits your otp should have digits  0-9 or 5-9 or 2- 6
		
		// Random take bydefault from 0-9
		
			SplittableRandom splittableRandom = new SplittableRandom();
			
			
			Random random = new Random();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<otpLength;i++)
			{
				sb.append(splittableRandom.nextInt(0, 10));
			}
			
			return sb.toString();
			
	}
	
	
	
	public static String generateOTP2()
	{
		
		int random=(int)(Math.random()*9000)+1000;
		
		String otp=String.valueOf(random);
		
		return otp;
	}

}
