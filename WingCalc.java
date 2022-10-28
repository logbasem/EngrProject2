
public class WingCalc {

	public static void main(String[] args) {
		Calculators testCalc = new Calculators(3, 6, 1, false);
		System.out.println("Number of wings: " + testCalc.returnNumWings());
		System.out.println("Number of fries: " + testCalc.returnFries());
	}

}
