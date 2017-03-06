package zadaci_06_03_2017;

public class TestMyCharacter {
	public static void main(String[] args) {
		
		MyCharacter ch1 = new MyCharacter('a');
		MyCharacter ch2 = new MyCharacter('b');
		
		System.out.println("ch1.equals(ch2): " + ch1.equals(ch2));
		
		System.out.println("MyCharacter.isDigit('7'): " + MyCharacter.isDigit('7'));
		
		System.out.println("MyCharacter.isLetter('7'): " + MyCharacter.isLetter('7'));
		
		System.out.println("MyCharacter.isLowerCase('A'): " + MyCharacter.isLowerCase('A'));
		
		System.out.println("MyCharacter.isUpperCase('A'): " + MyCharacter.isUpperCase('A'));
		
		System.out.println("MyCharacter.toUpperCase('a'): " + MyCharacter.toUpperCase('a'));
		
		System.out.println("MyCharacter.toLowerCase('A'): " + MyCharacter.toLowerCase('A'));
	}

}
