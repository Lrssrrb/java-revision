package day6.question2;

public class Video extends Media{
	private String name;
	private int length;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Video [name=" + name + ", length=" + length + "]";
	}
	public Video(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}
	
}
