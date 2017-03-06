package zadaci_06_03_2017;

import java.util.ArrayList;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		
		String s1 = "ab#12#453";
		String regex1 = "#";
		
		String s2 = "a?b?gf#e";
		String regex2 = "[?#]";

		
		String[] array1 = split(s1, regex1);
		String[] array2 = split(s2, regex2);
		
		for (String s : array1)
			System.out.print(s + " ");
		
		System.out.println();
		
		for (String s : array2)
			System.out.print(s + " ");
		
	
	}
	
	/**
	 * Method vraca niz Stringova sa regex_ima
	 * @param s
	 * @param regex
	 * @return
	 */
	public static String[] split(String s, String regex) {

        ArrayList<String> list = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < s.length(); i++) {

        	if(s.substring(i,i+1).matches(regex)) {
                list.add(s.substring(index, i));
                list.add(s.substring(i, i+1));
                index = i+1;
            }
        }
       
        list.add(s.substring(index, s.length()));
        
        return list.toArray(new String[list.size()]);
    }
}
