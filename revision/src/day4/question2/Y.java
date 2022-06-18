package day4.question2;

public interface Y {

	abstract void methodY1();
	default void methodY2() {
		System.out.println("Y          methodY2");
	}
	static void methodY3() {
		System.out.println("Y          methodY3");
	}
	
}
