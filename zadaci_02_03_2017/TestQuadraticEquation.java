package zadaci_02_03_2017;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		
		QuadraticEquation qe1 = new QuadraticEquation(1.0, 3, 1);
		QuadraticEquation qe2 = new QuadraticEquation(1, 2.0, 1);
		QuadraticEquation qe3 = new QuadraticEquation(1, 2, 3);
		
		QuadraticEquation[] qEArray = {qe1, qe2, qe3};
		
		for (int i=0; i < qEArray.length; i++) {
			
			System.out.println("Kvadratna jednadzba " + (i+1) + ":");
			
			if (qEArray[i].getDiscriminant() > 0) {
				System.out.print("Kvadratna jednadzba ima dva korijen: ");
				System.out.println(qEArray[i].getRoot1() + ", " + 
						qEArray[i].getRoot2());
			}
			else if (qEArray[i].getDiscriminant() == 0) {
				System.out.print("Kvadratna jednadzba ima jedan korijen: ");
				System.out.println(qEArray[i].getRoot1());
			}
			else 
				System.out.print("Kvadratna jednadzba nema realnih korijena");
		}
	}

}
