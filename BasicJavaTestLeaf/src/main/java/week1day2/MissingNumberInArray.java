package week1day2;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,7,6,8};
		int n= arr.length;
		int arrsum=0;
		int sum=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		{
		arrsum=	arrsum+arr[i];	
		}
		int missing_number= sum-arrsum;
		System.out.println(missing_number);
		
		// TODO Auto-generated method stub

	}

}
