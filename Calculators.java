/**"Prototype" class for storing different mathematical functions for calculator website.
 * 
 * @author logan
 *
 */
public class Calculators {
	private int numPeople;
	private int wingsPerPerson;
	private int hungerLevel;
	//private int budget;
	private boolean fries;
	
	public Calculators() {
		numPeople = 0;
		wingsPerPerson = 0;
		hungerLevel = 0;
		fries = false;
	}
	
	public Calculators(int numPeople, int wingsPerPerson, int hungerLevel, boolean fries) {
		this.numPeople = numPeople;
		this.wingsPerPerson = wingsPerPerson;
		this.hungerLevel = hungerLevel;
		this.fries = fries;
	}
	
	public int returnNumWings() {
		int wingsByPeople = numPeople * wingsPerPerson;
		
		if(hungerLevel == 1) {
			wingsByPeople*=1;
		}
		else if(hungerLevel == 2) {
			wingsByPeople*=1.5;
		} else {
			wingsByPeople*=2;
		}
		
		return wingsByPeople;
	}
	
	public int returnFries() {
		if(fries) {
			return numPeople;
		} else {
			return 0;
		}
	}
	
}
