package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n = 5,i;
		boolean isprime =true;
		
		for(i=2;i<=n-1;++i)
		{
			if(n%i==0)
			{
			    isprime=false;	
			
			}
		}
		if(isprime)
		{
			System.out.println("Given number is a Prime number");	
		
		}else
		{
		    System.out.println("Given number is not a Prime number");	
		}
		}
			
	}
