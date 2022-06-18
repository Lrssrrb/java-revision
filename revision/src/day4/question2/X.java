package day4.question2;

public interface X {

	abstract void methodX1();
	default void methodX2() {
		System.out.println("X          methodX2");
	}
	static void methodX3() {
		System.out.println("X          methodX3");
	}
	void methodY1();
}
