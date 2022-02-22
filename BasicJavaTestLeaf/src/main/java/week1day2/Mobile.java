package week1day2;

public class Mobile {
	
	public void makecall()
	{
		
	System.out.println("mADE CALL");
	}
	public void sendmsg()
	{
		System.out.println("sent msg");
	}
    public void positive ()
    {
    	int a=10;
    			if (a<10)
    			{
    				System.out.println("no is negative");
    			}
    			else if(a>=10)
    			{
    				System.out.println("no is positive");
    				}
    			else
    			{
    				System.out.println("no is zero");
    			}
    			
    }
    
    /**
     * 
     */
    public void Even_or_odd()
    {
    	int a=100;
    	if(a%2==0)
    	{
    		System.out.println("no is even");
    	}
    	else
    	{
    		System.out.println("no is odd");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile testobj = new Mobile();
testobj.makecall();
testobj.sendmsg();
testobj.positive();
testobj.Even_or_odd();
	}

}
