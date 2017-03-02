package zadaci_02_03_2017;

import utils.Helper;

public class IntersectionPoint {
	public static void main(String[] args) {
		
//		Helper help = new Helper();
		
		System.out.print("Unesite koordinate x1 i y1 za tacku 1: ");
		double[] t1 = controlInput();
		System.out.print("Unesite koordinate x2 i y2 za tacku 2: ");
		double[] t2 = controlInput();
		System.out.print("Unesite koordinate x3 i y3 za tacku 3: ");
		double[] t3 = controlInput();
		System.out.print("Unesite koordinate x4 i y4 za tacku 4: ");
		double[] t4 = controlInput();
		
		double a = t1[1] - t2[1];
		double b = -(t1[0] - t2[0]);
		double c = t3[1] - t4[1];
		double d = -(t3[0] - t4[0]);
		double e = (t1[1] - t2[1]) * t1[0] - (t1[0] - t2[0]) * t1[1];
		double f = (t3[1] - t4[1]) * t3[0] - (t3[0] - t4[0]) * t3[1];
		
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);
		
		if (le.isSolvable()) {
			System.out.println("x = " + le.getX());
			System.out.println("y = " + le.getY());
		}
		else
			System.out.println("Linije su paralelne");

	}
	
/**
 * Method kontrolise unos korisnika	
 * @return
 */
	public static double[] controlInput() {
		
		Helper help = new Helper();
		
		double[] arr;
		boolean isCorrectInput = false;
		do{
			arr = help.checkDoubleArrayInput(2);
			if (arr.length != 0) isCorrectInput = true;
//			else System.out.println("Nije validan unos");
		}while(!isCorrectInput);
		
		return arr;
	}

}
