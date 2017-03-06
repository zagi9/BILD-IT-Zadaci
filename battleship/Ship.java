package battleship;

public class Ship {

	private int carrier;
	private int cruiser;
	private int battleship;
	private int submarine;
	
	public Ship() {
		
	}
	
	public int getCarrier() {
		return carrier;
	}
	
	public int getCruiser() {
		return cruiser;
	}
	
	public int getBattleship() {
		return battleship;
	}
	
	public int getSubmarine() {
		return submarine;
	}
	
	/**
	 * Method biljezi pogodak broda i provjerava da li je pogodjeni broj potopljen
	 * @param c
	 */
	public void hitBoat(char c, Player p) {
		
		if (c == 'N'){
			carrier++;
			p.addHit();
			if(isSunk() && carrier == 4) {
				p.addSunk();
				System.out.println("Nosac aviona je potopljen");
			}	
		}
		
		if (c == 'K'){
			cruiser++;
			p.addHit();
			if(isSunk() && cruiser == 3) {
				p.addSunk();
				System.out.println("Krstarica je potopljena");
			}	
		}
		
		if (c == 'B'){
			battleship++;
			p.addHit();
			if(isSunk() && battleship == 2) {
				p.addSunk();
				System.out.println("Borbeni brod je potopljen");
			}	
		}
		
		if (c == 'P'){
			submarine++;
			p.addHit();
			if(isSunk() && submarine == 1) {
				p.addSunk();
				System.out.println("Podmornica je potopljena");
			}	
		}
	}
	
	/**
	 * Method provjerava da li je brod potopljen
	 * @return
	 */
	private boolean isSunk() {
		
		if (carrier == 4) return true;
		if (cruiser == 3) return true;
		if (battleship == 2) return true;
		if (submarine == 1) return true;
		
		return false;
	}
	
	/**
	 * Method provjerava da li su svi brodovi potopljeni
	 * @return
	 */
	public boolean isAllSunk() {
		
		if (carrier == 4 && cruiser == 3 && 
			battleship == 2 && submarine == 1)
			return true;
		
		return false;
	}
}
