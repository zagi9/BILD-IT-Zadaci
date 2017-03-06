package zadaci_06_03_2017;

public class MyStringBuilder1 {

	private String s;
	
	public MyStringBuilder1(String s) {
		this.s = s;
	}
	
	/**
	 * Method dodaje proslijedjeni MyStringBuilder1 na this
	 * @param s
	 * @return
	 */
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		
		this.s += s;
		return new MyStringBuilder1(this.s);
	}
	
	/**
	 * Method dodaje cijeli broj na this
	 * @param i
	 * @return
	 */
	public MyStringBuilder1 append(int i) {
		
		this.s += i;
		return new MyStringBuilder1(this.s);
	}
	
	public int length() {
		
		return s.length();
	}
	
	/**
	 * Method vraca karakter na proslijedjenom indeksu
	 * @param index
	 * @return
	 */
	public char charAt(int index) {
		
		return s.charAt(index);
	}
	
	/**
	 * Method vraca MyStringBuilder1 koji je this malim slovima
	 * @return
	 */
	public MyStringBuilder1 toLowerCase() {
		
		return new MyStringBuilder1(s.toLowerCase());
	}
	
	/**
	 * Method vraca MyStringBuilder1 koji je substring this 
	 * @param begin
	 * @param end
	 * @return
	 */
	public MyStringBuilder1 substring(int begin, int end) {
		
		String str = "";
		
		for(int i=begin; i < end; i++)
			str += s.charAt(i);
		
		return new MyStringBuilder1(str);
	}
	
	public String toString() {
		
		return s;
	}
}
