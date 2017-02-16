package zadaci_16_02_2017;

import utils.Helper;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.println("Unesite koordinate dvije tacke u stepenima:");
		
		System.out.print("x1: ");
		double x1 = help.checkDoubleInput();
		x1 = Math.toRadians(x1);
		
		System.out.print("y1: ");
		double y1 = help.checkDoubleInput();
		y1 = Math.toRadians(y1);
		
		System.out.print("x2: ");
		double x2 = help.checkDoubleInput();
		x2 = Math.toRadians(x2);
		
		System.out.print("y2: ");
		double y2 = help.checkDoubleInput();
		y2 = Math.toRadians(y2);

		greatCircleDistance(x1, y1, x2, y2);
		
	}
	
	/**
	 * Method prihvata koordinate dvije tacke na povrsini Zemlje, izracunava
	 *  i ispisuje razdaljinu izmedju njih
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public static void greatCircleDistance
		(double x1, double y1, double x2, double y2) {
		
		final double EARTH_RADIUS = 6371.01;
		
		double gcd = EARTH_RADIUS * 
				Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("Udaljenost izmedju ove dvije tacke iznosi " + gcd +"km");
	}

}
