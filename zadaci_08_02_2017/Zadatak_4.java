package zadaci_08_02_2017;

public class Zadatak_4 {
	public static void main(String[] args) {
		
		/* 
		   Index_e niza uzimam kao fixne brojeve 0 - 9 a elementi niza se
		   kroz petlju uvecavju za jedan, tako da cu po zavrsetku 
		   petlje (100 iteracija) imati vrijednosti elemenata kao
		   broj ponavljanja brojeva 0 - 9 (index_a)
		 */ 
		int[] nums = new int[10];
		for (int i=0; i < 100; i++) {
			// nasumicno generisanje cijelog broja 0 - 9
			int n = (int)(Math.random() * 10);
			// uvecanje elementa niza na indexu n
			nums[n]++;
		}
		
		for (int i=0; i < nums.length; i++) 
			System.out.println(i + " se ponavlja " + nums[i] + " puta");
	}
}
