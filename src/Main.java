
import types.*;
import answers.*;

public class Main {
	public static void main(String[] args) {
		Chapter ch1 = new Chapter(1, "Arrays and Strings");
		Question q_1_1 = new Question(ch1, 1, "Is Unique: Implement an algorithm to determine if a string has all unique characters.  What if you cannot use additional data structures?");
		String[] t_1_1 = {"123","343","10000","CbdeFgH","!12309Aba"};
		q_1_1.answer = new Answer_01_01(t_1_1);
		ch1.questions.add(q_1_1);
		q_1_1.run();
		Question q_1_2 = new Question(ch1, 2, "Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.");
		String[] t_1_2 = {"abcdefg","bcdefga","123","213","232","332"};
		q_1_2.answer = new Answer_01_02(t_1_2);
		q_1_2.run();
		
	}
}