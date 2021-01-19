package org.example;


import org.example.exception.InfectTestDateException;
import org.example.exception.InfectionException;
import org.example.exception.InsufficientFundsException;
import org.example.exception.NoFlyListException;


import java.util.Date;
import java.util.Scanner;

public class Destination {
	private String name;
	private Double distance;
	private Double costPerMile;
	private Boolean requireCovidTest;
	Boolean isAllowed = false;

	Destination(){
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getCostPerMile() {
		return costPerMile;
	}

	public void setCostPerMile(Double costPerMile) {
		this.costPerMile = costPerMile;
	}

	public Boolean getRequireCovidTest() {
		return requireCovidTest;
	}

	public void setRequireCovidTest(Boolean requireCovidTest) {
		this.requireCovidTest = requireCovidTest;
	}


	private void testDateValidation(Traveler traveler) throws InfectTestDateException{
		Scanner scanner = new Scanner(System.in);
		DateAddition dateAddition = new CovidResults();
		Date currentDate = traveler.getCovidResults().getDate();
		Date expiredDate = traveler.getCovidResults().getDate();
		System.out.println("How many days since your last covid test?");
		int newDate = scanner.nextInt();
		scanner.close();
		currentDate = dateAddition.addDays(currentDate,newDate);
		expiredDate = dateAddition.addDays(expiredDate, 3);

		if (currentDate.after(expiredDate)) {
			throw new InfectTestDateException();
		}
	}

	public void allowToVisit(Traveler traveler) throws InsufficientFundsException, NoFlyListException, InfectionException, InfectTestDateException {

		if (traveler.getMoney() < (costPerMile * distance)) {
			throw new InsufficientFundsException();
		}
		if (traveler.isNoFlyList()) {
			throw new NoFlyListException();
		}
		if (traveler.getCovidResults().getCovidPositive()) {

			throw new InfectionException();
		}
		if (requireCovidTest) {
			testDateValidation(traveler);
		}
		else  isAllowed = true;
	}

}
