package zadaci_07_03_2017;

import java.util.ArrayList;
import utils.Helper;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		ArrayList<Integer> list = help.fillArr();
		
		System.out.println(max(list));

	}
	
	/**
	 * Method vraca najveci clan ArryList<Integer>
	 * @param list
	 * @return
	 */
	public static Integer max(ArrayList<Integer> list) {
		
		if(list == null) return null;
		
		if(list.size() == 0) return null;
		
		Integer max = list.get(0);
		for(int i=0; i < list.size(); i++) 
			if (list.get(i) > max) max = list.get(i);
		
		return max;
	}

}
