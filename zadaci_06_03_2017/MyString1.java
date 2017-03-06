package zadaci_06_03_2017;

public class MyString1 {

	private char[] chars;
	
	public MyString1(char[] chars) {
		
		this.chars = new char[chars.length];
		for (int i=0; i < chars.length; i++)
			this.chars[i] = chars[i];
		
	}
	
	/**
	 * Method vraca karakter na proslijedjenom indeksu
	 * @param index
	 * @return
	 */
	public char charAt(int index) {
		return chars[index];
	}
	
	/**
	 * Method vraca duzinu MyString1
	 * @return
	 */
	public int length() {
		return chars.length;
	}
	
	/**
	 * Method vraca substring MyString1
	 * @param begin
	 * @param end
	 * @return
	 */
	public MyString1 substring(int begin, int end) {
		
		int length = end - begin;
		char[] c = new char[length];
		for(int i=0; i < c.length; i++) 
			c[i] = chars[begin + i];
		
		return new MyString1(c);
	}
	
	/**
	 * Method transformise slova MyString1 objekta u mala
	 * @return
	 */
	public MyString1 toLowerCase() {
		
		char[] c = new char[chars.length];
		
		for(int i=0; i < chars.length; i++) 
			c[i] = Character.toLowerCase(chars[i]);
		
		return new MyString1(c);
	}
	
	/**
	 * Method provjerava jednakost Objekata MyString1
	 * @param s
	 * @return
	 */
	public boolean equals(MyString1 s) {
		
		if(this.length() != s.length()) return false;
		
		for(int i=0; i < this.length(); i++) 
			if(this.charAt(i) != s.charAt(i)) return false;
		
		return true;
	}
	
	/**
	 * Method vraca proslijedjeni cijwli broj kao MyString1
	 * @param i
	 * @return
	 */
	public static MyString1 valueOf(int i) {
		
		char ch = (char)(i + '0');
		char[] c = {ch};
		return new MyString1(c);
	}
	
	public String toString() {
		
		String s = "";
		for(int i=0; i < chars.length; i++)
			s += chars[i];
		return s;
		
	}
}
