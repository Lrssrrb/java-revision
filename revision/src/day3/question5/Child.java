package day3.question5;

public final class Child extends Parent{

	public Child(int n) {
		super(n);
	}

	@Override
	public void method1() {
		System.out.println("class : Child \nmethod : method1");
		System.out.println("Number = " + number + "\n");
	}
	
	@Override
	public void method3() {
		System.out.println("class : Child \nmethod : method3 \n");
	}
	
	public void method4() {
		System.out.println("class : Child \nmethod : method4 \n");
	}
}
