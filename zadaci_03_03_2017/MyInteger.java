package zadaci_03_03_2017;

/**
 * Klasa definise MyInteger object. Sadrzi metode za provjeravanje parnosti 
 * cijelih brojeva, methode za provjeru prime brojeva i metode za transformisanje
 * niza karaktera i stringova u cijele brojeve
 * @author Milan
 *
 */
public class MyInteger {

	private int value;
	
	public MyInteger(int value) {
		
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return value % 2 != 0;
	}
	
	public boolean isPrime() {
		
		for(int i=2; i <= value/2; i++)
			if(value % i == 0) return false;
					
		return true;			
	}
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}
	
	public static boolean isPrime(int n) {
		
		for(int i=2; i <= n/2; i++)
			if(n % i == 0) return false;
					
		return true;			
	}
	
	public static boolean isEven(MyInteger n) {
		return n.getValue() % 2 == 0;
	}
	
	public static boolean isOdd(MyInteger n) {
		return n.getValue() % 2 != 0;
	}
	
	public static boolean isPrime(MyInteger n) {
		
		for(int i=2; i <= n.getValue()/2; i++)
			if(n.getValue() % i == 0) return false;
					
		return true;			
	}
	
	public boolean equals(int n) {
		return value == n;
	}
	
	public boolean equals(MyInteger n) {
		return value == n.getValue();
	}
	
	public static int parseInt(char[] ch) throws NonNumericValueException {
		
		int n = 0;
		
		for(int i=0; i < ch.length; i++) {
			
			if(Character.isDigit(ch[i])) {
				n += ch[i] - '0';
				n *= 10;
			}
			else {
				throw new NonNumericValueException();
			}
		}
		
		n /= 10;
		return n;
	}
	
	public static int parseInt(String s) throws NonNumericValueException {
		
		int n = 0;
		
		for(int i=0; i < s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) { 
				n += s.charAt(i) - '0';
				n *= 10;
			}
			
			else if(i == 0 && s.charAt(i) == '-') 
				continue;
			
			else {
				throw new NonNumericValueException();
			}
			
		}
		n /= 10;
		if (s.charAt(0) == '-') return -n;
		return n;
	}
}
