package zadaci_08_03_2017;

import java.util.ArrayList;
import utils.Helper;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		ArrayList<Double> list = help.listOfDoubles(5);
		
		System.out.println("Suma brojeva je " + sum(list));
	}
	
	/**
	 * Method sabira i vraca zbir brojeva iz ArrayList<Double>
	 * @param list
	 * @return
	 */
	public static double sum(ArrayList<Double> list) {
		
		double num = 0;
		
		for(int i=0; i < list.size(); i++)
			num += list.get(i);
		
		return num;
	}
}
