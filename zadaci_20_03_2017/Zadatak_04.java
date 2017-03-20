package zadaci_20_03_2017;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Integer[][] list = {{1, 2, 3}, {2, 3, 5}, {6, 3, 9}};
		System.out.println("Najveci elemenat 2D niza je " + max(list));

	}
	
	public static <E extends Comparable<E>> E max(E[][] list) {
		
		E largest = list[0][0];
		for (int i=0; i < list.length; i++) {
			for (int j=0; j < list.length; j++) {
				if (list[i][j].compareTo(largest) == 1) {
					largest = list[i][j];
				}
			}
		}
		return largest;
	}

}
