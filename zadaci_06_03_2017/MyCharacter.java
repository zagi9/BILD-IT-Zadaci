package zadaci_06_03_2017;

public class MyCharacter {
	
	char ch;
	
	public MyCharacter(char ch) {
	    this.ch = ch;
	  }

	/**
	 * Method provjerava da li su Proslijedjeni objekat i this jednaki
	 * @param mc
	 * @return
	 */
	public boolean equals(MyCharacter mc) {
		return this.ch == mc.ch;
	}

	/**
	 * Method provjerava da li je proslijedjeni karakter cifra
	 * @param ch
	 * @return
	 */
	public static boolean isDigit(char ch) {
		return ch >= '0' && ch <= '9';
	}

	/**
	 * Method provjerava da li je proslijedjeni karakter slovo
	 * @param ch
	 * @return
	 */
	public static boolean isLetter(char ch) {
		return (ch >= 'a' && ch <= 'z') ||
	           (ch >= 'A' && ch <= 'Z');
	}
	
	/**
	 * Method provjerava da li je proslijedjeni karakter slovo ili cifra
	 * @param ch
	 * @return
	 */
	public static boolean isLetterOrDigit(char ch) {
		return isLetter(ch) || isDigit(ch);
	}

	/**
	 * Method provjerava da li je proslijedjeni karakter malo slovo
	 * @param ch
	 * @return
	 */
	public static boolean isLowerCase(char ch) {
	    return (ch >= 'a' && ch <= 'z');
	}

	/**
	 * Method provjerava da li je proslijedjeni karakter veliko slovo
	 * @param ch
	 * @return
	 */
	public static boolean isUpperCase(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	/**
	 * Method mijenja proslijedjeno slovo u veliko i vraca
	 * @param ch
	 * @return
	 */
	public static char toUpperCase(char ch) {
		if (isLowerCase(ch))
			return (char)(ch - 'a' + 'A');
		else
			return ch;
	}
	
	/**
	 * Method mijenja proslijedjeno slovo u malo i vraca
	 * @param ch
	 * @return
	 */
	public static char toLowerCase(char ch) {
		if (isUpperCase(ch))
			return (char)(ch - 'A' + 'a');
	    else
	    	return ch;
	}
}
