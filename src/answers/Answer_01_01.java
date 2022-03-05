package answers;
import types.*;

public class Answer_01_01 extends Answer{
		
	public static boolean is_unique(String s) {
		for (int i = 0;i<s.length();i++) {
			for (int j=i+1;j<s.length();j++) {
				if (s.charAt(i)==s.charAt(j)) {
					System.out.println(s+": \t False");
					return true;
				}
			}
		}
		System.out.println(s+": \t True");
		return false;
	}
	
	@Override 
	public void call() {
		for (int i = 0;i< args.length;i++) {
			is_unique(args[i]);
		}

	}
	public Answer_01_01(){		
	}
	public Answer_01_01(String[] args) {
		Answer.args=args;
	}
}
