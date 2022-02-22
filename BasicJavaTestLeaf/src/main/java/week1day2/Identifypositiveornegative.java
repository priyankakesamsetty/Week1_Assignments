package week1day2;

public class Identifypositiveornegative {
	public void Identifynumber(int num)
	{
		if(num<0)
		{
		num=-(num);
		System.out.println("Number is converted to positive  " + num);
		}
		else
		{
			System.out.println("Number is positive");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Identifypositiveornegative obj = new Identifypositiveornegative();
		obj.Identifynumber(40);

	}

}
