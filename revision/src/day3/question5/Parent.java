package day3.question5;

public abstract class Parent {

	final int number;
	
	public abstract void method1();
	
	public final void method2() {
		System.out.println("class : Parent \nmethod : method2 \n");
	}
	
	public void method3() {
		System.out.println("class : Parent \nmethod : method2 \n");
	}
	
	public Parent(int n) {
		number = n;
	}
}
