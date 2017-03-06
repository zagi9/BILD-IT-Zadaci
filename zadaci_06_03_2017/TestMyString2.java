package zadaci_06_03_2017;

public class TestMyString2 {
	public static void main(String[] args) {
		
		
		String s = "dbCdE";
		
		MyString2 ms1 = new MyString2(s);
		System.out.println("ms1.compare(\"dbCdE\"): " + ms1.compare("dbCdE"));
		
		System.out.println("ms1.substring(2): " + ms1.substring(2));
		
		System.out.println("ms1.toUpperCase(): " + ms1.toUpperCase());
		
		char[] chars = ms1.toChars();
		System.out.print("ms1.toChars(): ");
		for(char c : chars)
			System.out.print(c + " ");
		System.out.println();
		
		System.out.println("MyString2.valueOf(false): " + MyString2.valueOf(false));

	}

}
