package day6.question2;

public class Newspaper extends Media{

	private String name;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Newspaper [name=" + name + ", type=" + type + "]";
	}
	public Newspaper(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	
}
