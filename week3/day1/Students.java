package week3.day1;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("ID is "+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
	}
	public void getStudentInfo(String email, int phno)
	{
	
		System.out.println("Email id is "+email);
		System.out.println("Phone number is "+phno);
	}
	public static void main(String args[])
	{
		Students s=new Students();
		s.getStudentInfo(46);
		s.getStudentInfo(43, "Jagan");
		s.getStudentInfo("jagan@gmail.com", 987654321);
	}
}