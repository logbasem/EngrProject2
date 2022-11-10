/**A test JavaScript file!
 */

var calculateButton = document.getElementById("calculateButton");
calculateButton.addEventListener("click", () => buttonClicked());

function buttonClicked() {
	var numPeople = document.getElementById("numPeople");
	var wingsPerPerson = document.getElementById("wingsPerPerson");
	var hungerLevel = document.getElementById("hungerLevel");
	var fries = document.getElementById("fries");
	console.log(calculateWings(numPeople.value, wingsPerPerson.value, hungerLevel.value));
	if(fries.checked) {
		console.log("With fries");
	}
}

function calculateWings(numPeople, wingsPerPerson, hungerLevel) {
	var wingsByPeople = numPeople * wingsPerPerson;
		
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