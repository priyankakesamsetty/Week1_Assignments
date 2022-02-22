package week1day2;

public class Sumofdigits1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int sum=0;
		for(number=1234;number>0;number=number/10)
		{
			int remainder= number%10;
			sum=sum+remainder;
			
		}
		System.out.println(sum);
		

	}

}
