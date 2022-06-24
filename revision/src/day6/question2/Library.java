package day6.question2;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Media> libraryList = new ArrayList<Media>();
	
	void addToList(Media e) {
		libraryList.add(e);
	}

	void showListElements() {
		System.out.println(libraryList);
	}

	public static void main(String[] args) {
		
		Library obj = new Library();
		
		Video v = new Video("the boys", 60);
		obj.addToList(v);
		Book b = new Book("harry", 100);
		obj.addToList(b);
		Newspaper n = new Newspaper("DB","bollywood" );
		obj.addToList(n);
		obj.showListElements();
	}
}
