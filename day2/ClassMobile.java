package week1.day2;

public class ClassMobile {

	public void sendSms()
	{
		System.out.println("From Oppo");
	}
	
	public long makeCall(long phno)
	{
		return phno;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassMobile mobile = new ClassMobile();
		mobile.sendSms();
		System.out.println("Mobile no is: "+mobile.makeCall(1234567890));
	}

}
