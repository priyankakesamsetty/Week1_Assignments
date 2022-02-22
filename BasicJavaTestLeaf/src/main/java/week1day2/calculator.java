package week1day2;

public class calculator {
	
	public void sum(int num1,int num2,int num3)
	{
		int sum=num1+num2+num3;
		System.out.println(sum);
	}
	
    public void sub(int num1, int num2)
    {
    	int sub= num1-num2;
    	System.out.println(sub); 	
    }
    
    public void mul(double num1, double num2)
    {
    	double mul=num1*num2;
    	System.out.println(mul);	
    }
    public void divide(float num1,float num2)
    {
    	float div= num1/num2;
    	System.out.println(div);
    }

	public static void main(String[] args) {
		
		calculator obj1= new calculator();
		obj1.sum(10, 20, 3);
		obj1.sub(5, 3);
		obj1.mul(100, 200);
		obj1.divide(2000, 5);
		

		// TODO Auto-generated method stub

	}

}
