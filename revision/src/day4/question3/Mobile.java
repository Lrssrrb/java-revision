package day4.question3;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void searchOutdatedModel(String company ,String ...models){
		for (String m : models) {
			if(m == "note4" || m == "note5" || m=="note6" || m=="note7")
				System.out.println(m+"_OUTDATED");
		}
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.searchOutdatedModel("Oppo", "note4","mj5");
	}
}
