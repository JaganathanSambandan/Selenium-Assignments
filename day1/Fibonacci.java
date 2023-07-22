package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum = 0;
		int secnum=1;
		int sum=0;
		int i;
		System.out.println("Fibonacci = " +firstnum);
		for(i=0;i<=11;++i) {
			
			sum=firstnum+secnum;
			if(sum<=56) {
			System.out.println(sum);
			firstnum=secnum;
			secnum=sum;
			}
		}	
	}
}