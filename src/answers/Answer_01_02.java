package answers;
import types.*;



public class Answer_01_02 extends Answer{
	public static String[] args;
	public static String remove_char_at(String s, int index) {
		String p1, p2;
		if (index>0){
			p1 =  s.substring(0,index);
		}
		else {
			p1 = s.substring(index+1);
			//System.out.println(s+"\t"+p1+"\t\t"+s.charAt(index)+"\t"+index);
			return p1;
		}
		
		if (index<s.length()-1) {
			p2 = s.substring(index+1,s.length());
		}
		else p2 = s.substring(s.length());
		//System.out.println(s+"\t"+p1+"\t"+p2+"\t"+s.charAt(index)+"\t"+index);
		return p1+p2;
	}
	
	
	public static boolean check_permutation(String s_a, String s_b) {
		//System.out.println("comparing:\t"+s_a+"\t"+s_b);
		if (s_a.length()!=s_b.length()) {
			return false;
		}
		while (s_a.length()>0){
			char temp = s_a.charAt(0);
			for (int j=0;j<s_b.length();j++) {
				if (temp==s_b.charAt(j)) {
					s_b = remove_char_at(s_b,j);
					s_a = remove_char_at(s_a,0);
					return check_permutation(s_a,s_b);
				}		
			}return false;
		}
		return true;
	}

	public static void string_tester() {
		for (int i = 0;i<((args.length-1));i+=2) {
			String s_a = args[i];
			String s_b = args[i+1];
			System.out.println(s_a+"\t"+s_b+"\t"+check_permutation(s_a,s_b));
		}
	}
	
	@Override 
	public void call() {
		string_tester();
	}
	
	
	
	
	public Answer_01_02(){		
	}
	public Answer_01_02(String[] args) {
		Answer_01_02.args=args;
	}

}
