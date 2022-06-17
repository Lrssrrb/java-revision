package test;

public class C1 extends C2{

	public String var = "C1 	var";
	
	private void math() {
		String a = this.var;
		String b = super.var;	
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj = new C1();
		obj.math();
	}

}
