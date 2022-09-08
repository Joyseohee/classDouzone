package ex07.innerclass;

class OuterClass {
	static int no;
	String message = "hello~~";
	
	public void outerMethod() {
		System.out.println("outer method call~~");
	}
	
	class InnerClass {
		int su = 99;
		public void show() {
			System.out.println(su);	// usable inner(self) 
			System.out.println(message);	// usable outer
		}
		public void disp() {
			outerMethod();	// call outerClass method
		}
	}	// InnerClass end
}	// outerClass end

public class MainEntry {
	public static void main(String[] args) {
		// @1
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		
		inner.disp();
		inner.show();
		
		// @2
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
	}
}
