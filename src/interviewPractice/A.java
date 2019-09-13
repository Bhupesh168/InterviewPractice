package interviewPractice;

public class A {
	static {
		
		System.out.println("I am in static block of A class");
		
	}
	
	A(){
		
		System.out.println("I am in A class construtor");
		System.out.println(1+2+"3");
	}
	
	{
		System.out.println("I am in A class Instance block");
		
	}
	
	
	private void check() {
		
		System.out.println("hi i am in A");
		
	}
	
	public Object method() {
		
		System.out.println("in A");
		return null;
	}
	
	 public static void main(String[] args) {
		 
		 A a= new A();
		 a.check();
	 }

}
