package week1day2;

public class Factorialofanumber {

	public void Factorialnumber()
	{
		
		int a=5;
	    int result=1;
		for(a=1;a>=5;a++) 
		{
		result=a*result;
		}
		System.out.println("Factorial of  5 is  " + result);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorialofanumber obj = new Factorialofanumber();
obj.Factorialnumber();
	}

}
