package day6.question2;

public class Book extends Media{

	private String name;
	private int pages;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + "]";
	}
	public Book(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}
	
}
