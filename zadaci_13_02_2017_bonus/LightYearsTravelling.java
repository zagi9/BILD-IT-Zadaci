package zadaci_13_02_2017_bonus;

public class LightYearsTravelling {

	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		final double LS = 299_792_458 / 1000;
		final double AU = 149_600_000;
		final double PARSEC = 3.26;
		final double HELIOS2 = 252_792.537;
		
		System.out.print("Unesite broj svjetlosnih godina ");
		double lightYears = help.checkDoubleInput();
		
		double totalDistanceInKm = LS * (365 * 24 * 60 * 60) * lightYears;
		double passedAU = totalDistanceInKm / AU;
		double parsecTotal = lightYears / PARSEC;
		double helios2TimeTravell = totalDistanceInKm / HELIOS2; 
		
		System.out.println();
		System.out.println(totalDistanceInKm + " km svjetlost predje u datom vremenu");
		System.out.println(passedAU + " AU svjetlost predje u datom vremenu");
		System.out.println(parsecTotal + " parseca svjetlost predje u datom vremenu");
		System.out.println("Da bi Helios2 presao ovu udaljenost treba " + 
				helios2TimeTravell + " sati");

	}

}
