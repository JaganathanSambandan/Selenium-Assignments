package week3.day1;

public class AxisBank extends BankInfo{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Method has been called from Child Class");
		super.deposit();
	}
	public static void main(String[] args) 
	{
		AxisBank ax=new AxisBank();
		ax.saving();
		ax.fixed();
		ax.deposit();
	}
}