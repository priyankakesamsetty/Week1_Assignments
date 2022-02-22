package week1day2;

public class Fibonacciseries {
	
	
	public static void main(String[] args) {
		
		int number1=0;
		int number2=1;
		int fib;
		int count=8;
		System.out.println(number1+ "\n"  +number2);
		
		for(int i=2;i<count;i++)
		{
			fib=number1+number2;
			System.out.println(fib);
			number1=number2;
			number2=fib;
		}
		// TODO Auto-generated method stub

	}

}
