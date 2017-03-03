package zadaci_03_03_2017;

public class TestMyInteger {

	public static void main(String[] args) throws NonNumericValueException {
		
		MyInteger n = new MyInteger(5);
		
		System.out.println(n.isEven());
		System.out.println(n.isOdd());
		System.out.println(n.isPrime());
		System.out.println();
		
		System.out.println(MyInteger.isEven(7));
		System.out.println(MyInteger.isOdd(67));
		System.out.println(MyInteger.isPrime(23));
		System.out.println();
		
		System.out.println(MyInteger.isEven(new MyInteger(5)));
		System.out.println(MyInteger.isOdd(new MyInteger(7)));
		System.out.println(MyInteger.isPrime(new MyInteger(123)));
		System.out.println();
		
		System.out.println(n.equals(6));
		System.out.println(n.equals(new MyInteger(5)));
		System.out.println();
	
		System.out.println(MyInteger.parseInt(new char[]{'1', '8', '4'}));
		System.out.println(MyInteger.parseInt("-123"));
		
	}

}
