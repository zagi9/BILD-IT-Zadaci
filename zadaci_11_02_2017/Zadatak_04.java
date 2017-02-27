package zadaci_11_02_2017;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		printCharsAndNums();
		
	}
	
	// Method ispisuje nasumicno izabrane brojeve, deset po liniji i
	// nasumicno izabrane karaktere, deset po liniji
	public static void printCharsAndNums() {
		
		for (int i=1; i <= 100; i++) {
			if (i % 10 == 0) System.out.printf("%3d\n", randomInt());
			else System.out.printf("%3d", randomInt());
		}
		System.out.println();
		
		for (int i=1; i <= 100; i++) {
			if (i % 10 == 0) System.out.printf("%3c\n", randomChar());
			else System.out.printf("%3c", randomChar());
		}
	}
	
	// Method nasumicno bira i vraca cijeli broj 0-9
	public static int randomInt() {
		return (int) (Math.random() * 10);
	}
	
	// Method nasumicno bira i vraca karakter A-Z
	public static char randomChar() {
		return (char)((int) ('A' + Math.random() * ('Z' - 'A' + 1)));
	}

}
