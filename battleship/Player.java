package battleship;

public class Player {

	private int hit;
	private int sunk;
	
	public Player() {
		
	}

	/**
	 * Method dodaje pogotke igracu
	 */
	public void addHit() {
		hit++;
	}
	
	public int getHit() {
		return hit;
	}
	
	/*
	 * Method dodaje potopljeni brod igracu
	 */
	public void addSunk() {
		sunk++;
	}
	
	/**
	 * Method vraca broj potopljenih brodova igracu
	 * @return
	 */
	public int getSunk() {
		return sunk;
	}
}
