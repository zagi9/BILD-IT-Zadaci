package zadaci_06_03_2017;

public class MyString2 {
	
	String s = "";
	
	public MyString2(String s) {
		
		this.s = s;
	}
	
	/**
	 * Method poredi MyString2 sa proslijedjenim stringom
	 * @param s
	 * @return
	 */
	public int compare(String s) {
		
		int n = 0;
		
		for (int i=0; i < s.length(); i++) {
			if(this.s.charAt(i) < s.charAt(i)) return -1;
			if(this.s.charAt(i) > s.charAt(i)) return 1;
			
		}
		return n;
	}
	
	/**
	 * Metod vraca substring MyString2, pocev od indexa "begin"
	 * @param begin
	 * @return
	 */
	public MyString2 substring(int begin) {
		
		String s = "";
		for (int i=0; i < this.s.length() - begin; i++)
			s += this.s.charAt(i + begin);
		
		return new MyString2(s);
	}
	
	/**
	 * Metod vraca MyString2 sa velikim slovima
	 * @return
	 */
	public MyString2 toUpperCase() {
		
		String str = "";
		for(int i=0; i < s.length(); i++) 
			str += Character.toUpperCase(s.charAt(i));
		
		return new MyString2(str);
	}
	
	/**
	 * Method vraca niz karaktera iz MyString2
	 * @return
	 */
	public char[] toChars() {
		
		char[] chars = new char[s.length()];
		
		for(int i=0; i < chars.length; i++)
			chars[i] = s.charAt(i);
		
		return chars;
	}
	
	/**
	 * Method vraca boolean kao MyString2
	 * @param b
	 * @return
	 */
	public static MyString2 valueOf(boolean b) {
		
		String str = "";
		str = b ? "true" : "false";
		
		return new MyString2(str);
	}
	
	public String toString() {
		return s;
	}
}
