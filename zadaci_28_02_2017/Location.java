package zadaci_28_02_2017;

public class Location {

	public int row;
	public int column;
	public double maxValue;
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	/**
	 * Method "trazi" najveci broj matrice i lokaciju
	 * @param a
	 * @return
	 */
	public static Location locateLargest(double[][] a) {
		
		int maxRow = 0;
		int maxCol = 0;
		double max = a[maxRow][maxCol];
		
		for (int i=0; i < a.length; i++) {
			for (int j=0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					maxRow = i;
					maxCol = j;
					max = a[i][j];
				}
			}
		}
		return new Location(maxRow, maxCol, max);
	}
}
