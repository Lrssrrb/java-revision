package test;

public class C3 {
	
	
	
	public static void main(String[] args) {
		try {
			Object o = new Object();
		String s = (String)o;
			System.out.println(s);
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		
	}

}
