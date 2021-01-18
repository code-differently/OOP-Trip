package org.example;


import org.example.exception.InfectTestDateException;
import org.example.exception.InfectionException;
import org.example.exception.InsufficientFundsException;
import org.example.exception.NoFlyListException;


import java.util.Date;

public class Destination {
	private String name;
	private Double distance;
	private Double costPerMile;
	private Boolean requireCovidTest;

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



	public void allowToVisit(Traveler traveler) throws InsufficientFundsException, NoFlyListException, InfectionException, InfectTestDateException {

			if(traveler.getMoney() < (costPerMile*distance)) {
				throw new InsufficientFundsException();
			}
			if(traveler.isNoFlyList()){
				throw  new NoFlyListException();
			}
			if(traveler.getCovidResults().getCovidPositive()){
				throw  new InfectionException();
			}

			Date currentDate = traveler.getCovidResults().getDate();
			Date expiredDate = traveler.getCovidResults().addDays();
			if( currentDate.after(expiredDate)){
				throw new InfectTestDateException();
			}
	}
}
