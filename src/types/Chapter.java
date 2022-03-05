package types;

import java.util.ArrayList;

public class Chapter {
	int chapter_no;
	String chapter_name;
	public ArrayList<Question> questions = new ArrayList<Question>();
	public Chapter(int chapter_no, String chapter_name) {
		this.chapter_no = chapter_no;
		this.chapter_name = chapter_name;
	}
	
	@Override
	public String toString() {
		return "Chapter: " + String.valueOf(chapter_no) + ": " + chapter_name;
	}

}
