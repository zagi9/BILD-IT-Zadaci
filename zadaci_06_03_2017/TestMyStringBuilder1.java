package zadaci_06_03_2017;

public class TestMyStringBuilder1 {
	public static void main(String[] args) {
		
		String s = "aBcDeF";
		
		MyStringBuilder1 msb1 = new MyStringBuilder1(s);
		MyStringBuilder1 msb2 = new MyStringBuilder1("MnOgH");
		
		System.out.println("msb1.append(msb2): " + msb1.append(msb2));
		
		System.out.println("msb1.append(1): " + msb1.append(1));
		
		System.out.println("msb1.charAt(1): " + msb1.charAt(1));
		
		System.out.println("msb1.toLowerCase(): " + msb1.toLowerCase());
		
		System.out.println("msb1.substring(2, 4): " + msb1.substring(2, 4));

	}

}
