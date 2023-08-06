package week3.day1;

public class Automation extends MultipleLanguage implements TestTool {

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Language is Java");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Tool is Selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Language is Ruby");
	}
	
	public static void main(String[] args) {
		Automation a=new Automation();
		a.python();
		a.Java();
		a.Selenium();
		a.ruby();
	}
}
