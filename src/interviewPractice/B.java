package interviewPractice;

public class B extends A{
	
	static {
		System.out.println("I am in static block of B class");
		
	}
	
	B(){
		
		System.out.println("I am in B class Constructor");
	}

	{
		System.out.println("I am in B class instance block");
		
	}
	private void check() {
		
		System.out.println("hi i am in B");
		//return null;
		
		
		
	}
	
	@Override
	public String method () {
		
		System.out.println("In B");
		return null;
	}
public void access() {
	
	System.out.println("i am in B access");
}
}
