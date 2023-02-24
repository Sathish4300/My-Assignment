package oops;

public class Automation extends MultipleLanguage {

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
		
	}
	public static void main(String[] args) {
		Automation language = new Automation();
		language.java();
		language.python();
		language.ruby();
	}
	

}
