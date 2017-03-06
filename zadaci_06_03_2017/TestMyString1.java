package zadaci_06_03_2017;

public class TestMyString1 {
	public static void main(String[] args) {
		
		char[] c = {'a', 'S', 'A', 'l'};
		
		
		MyString1 ms1 = new MyString1(c);
		System.out.println("ms1.charAt(1): " + ms1.charAt(1));
		System.out.println("ms1.length(): " + ms1.length());
		
		MyString1 ms2 = ms1.toLowerCase();
		System.out.println("ms1.toLowercase():  " + ms2);
		
		MyString1 ms3 = ms1.substring(0, 2);
		System.out.println("ms1.substring(0, 2): " + ms3);
		
		System.out.println("ms1.equals(ms2): " + ms1.equals(ms2));
		
		System.out.println("MyString1.valueOf(1): " + MyString1.valueOf(1));
		
		
	}

}
