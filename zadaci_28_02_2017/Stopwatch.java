package zadaci_28_02_2017;

public class Stopwatch {

	private long startTime;
	private long endTime;
	
	public Stopwatch() {
		
		startTime = System.currentTimeMillis();
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	
	/**
	 * Method inicijalizira startTime na trenutno vrijeme
	 */
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	/**
	 * Method inicijalizira endTime na trenutno vrijeme
	 */
	public void end() {
		endTime = System.currentTimeMillis();
	}
	
	/**
	 * Method izracunava koliko je vremena proteklo uporedjujuci endTime i startTime
	 * @return
	 */
	public long getElapsedTime() {
		return getEndTime() - getStartTime();
	}
}
