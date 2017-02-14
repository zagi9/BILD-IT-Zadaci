package zadaci_14_02_2017;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesite ubrzanje aviona: ");
		double a = help.checkDoubleInput();
		
		System.out.print("Unesite brzinu potrebnu da avion poleti: ");
		double v = help.checkDoubleInput();
		
		System.out.print("Minimalna duzina piste potrebna da avion poleti je: "
				+ minLength(v, a) + " metra");
		
	}
	
	/**
	 * Method prihvata parametre v-brzina i a-ubrzanje i izracunava minimalnu 
	 * duzinu piste potrebnu da avion poleti 
	 * @param v
	 * @param a
	 * @return
	 */
	public static double minLength(double v, double a) {
		
		return v * v / (2 * a);
	}

}
