package test;

public class Functional_Interface {

	interface Squer{
		int call(int x);
	}
	
	public static void main(String[] args) {
		int s = 5;
		Squer ss = (int x) ->x*x;
		System.out.println(ss.call(s));
	}
}
