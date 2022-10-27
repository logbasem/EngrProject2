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
	
	public int returnNumWings() {
		int wingsByPeople = numPeople * wingsPerPerson;
		
		wingsByPeople = wingsByPeople * hungerLevel;
		
		return wingsByPeople;
	}
	
	
	//calculate total wings * numPeople
	
	
	
	//calculate hungerLevel multiplier
	
	
	//add fries if fries true
	
}
